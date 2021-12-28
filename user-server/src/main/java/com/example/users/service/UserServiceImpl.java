package com.example.users.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.example.users.dto.FlightBookingDto;
import com.example.users.dto.FlightHistoryDto;
import com.example.users.dto.FlightHistoryRequestDto;
import com.example.users.dto.PnrDto;
import com.example.users.dto.TicketUpdateDto;
import com.example.users.dto.UserFlightStatusDto;
import com.example.users.dto.UserSignUpDto;
import com.example.users.dto.UserSignUpResponseDto;
import com.example.users.entity.FlightBookingDetailEntity;
import com.example.users.entity.UserLoginEntity;
import com.example.users.proxy.AdminProxy;
import com.example.users.repository.FlightBookingDetailRepository;
import com.example.users.repository.UserLoginRepository;
import com.example.users.util.UserConstant;

/**
 * The type Flight user operation service.
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * The Flight booking detail repository.
	 */
	private final FlightBookingDetailRepository flightBookingDetailRepository;

	/** The model mapper. */
	private final ModelMapper modelMapper;

	/** The user login repo. */
	private final UserLoginRepository userLoginRepo;

	/** The proxy. */
	private final AdminProxy proxy;

	/**
	 * Instantiates a new user service impl.
	 *
	 * @param flightBookingDetailRepository the flight booking detail repository
	 * @param modelMapper                   the model mapper
	 * @param userLoginRepo                 the user login repo
	 * @param proxy                         the proxy
	 */
	public UserServiceImpl(FlightBookingDetailRepository flightBookingDetailRepository, ModelMapper modelMapper,
			UserLoginRepository userLoginRepo, AdminProxy proxy) {
		super();
		this.flightBookingDetailRepository = flightBookingDetailRepository;
		this.modelMapper = modelMapper;
		this.userLoginRepo = userLoginRepo;
		this.proxy = proxy;
	}

	/**
	 * Book ticket pnr dto.
	 *
	 * @param bookingDetail the booking detail
	 * @return the pnr dto
	 */
	@Override
	public PnrDto bookTicket(FlightBookingDto bookingDetail) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		PnrDto returnDto = new PnrDto();

		FlightBookingDetailEntity entity = modelMapper.map(bookingDetail, FlightBookingDetailEntity.class);
		FlightBookingDetailEntity pnrEntity = flightBookingDetailRepository.findByPnrNo(bookingDetail.getPnrNo());
		if (pnrEntity != null) {
			entity.setFlightBookingDetailId(pnrEntity.getFlightBookingDetailId());
		} else {
			entity.setPnrNo(RandomStringUtils.randomAlphanumeric(8).toUpperCase());
		}
		entity = flightBookingDetailRepository.save(entity);
		returnDto.setPnrNo(entity.getPnrNo());
		TicketUpdateDto ticketDto = new TicketUpdateDto();
		ticketDto.setFlightNo(bookingDetail.getFlightNo());
		ticketDto.setCancelTicket(1);
		ticketDto.setSeatType(bookingDetail.getSeatType());
		proxy.ticketUpdate(ticketDto);
		return returnDto;
	}

	/**
	 * Cancel ticket user flight status dto.
	 *
	 * @param pnrNo the pnr no
	 * @return the user flight status dto
	 */
	@Override
	public UserFlightStatusDto cancelTicket(String pnrNo) {
		UserFlightStatusDto returnDto = new UserFlightStatusDto();
		FlightBookingDetailEntity entity = flightBookingDetailRepository.findByPnrNo(pnrNo);

		entity.setCancelTicket(UserConstant.INACTIVE_FLAG);
		flightBookingDetailRepository.save(entity);
		returnDto.setStatus("Flight Cancelled");

		return returnDto;
	}

	/**
	 * Search flight details by email or pnr list.
	 *
	 * @param emailIdPnr the email id pnr
	 * @return the list
	 */
	public List<FlightBookingDetailEntity> searchFlightDetailsByEmailOrPnr(String emailIdPnr) {
		return flightBookingDetailRepository.findByCustomerEmailIdOrPnrNo(emailIdPnr, emailIdPnr);
	}

	@Override
	public List<FlightHistoryDto> getFlightHistory(FlightHistoryRequestDto dto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<FlightHistoryDto> resultList = new ArrayList<>();
		long millis = System.currentTimeMillis();
		List<FlightBookingDetailEntity> flightEntityList = flightBookingDetailRepository
				.findByCustomerEmailId(dto.getUserName());
		for (FlightBookingDetailEntity flightEntity : flightEntityList) {

			long bookingDate = flightEntity.getDateTime().getTime();
			FlightHistoryDto resultDto = modelMapper.map(flightEntity, FlightHistoryDto.class);
			if (flightEntity.getSeatType() == 0) {
				resultDto.setSeatType("Non Business Seat");
			} else if (flightEntity.getSeatType() == 1) {
				resultDto.setSeatType("Business Seat");
			}
			if ((bookingDate - millis) <= 86400000) {
				resultDto.setCanCancel(0);
			} else {
				resultDto.setCanCancel(1);
			}
			resultList.add(resultDto);
		}
		return resultList;
	}

	@Override
	public UserSignUpResponseDto userSignUp(UserSignUpDto dto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserSignUpResponseDto resultDto = new UserSignUpResponseDto();
		if (userLoginRepo.findByEmailId(dto.getEmailId()).isEmpty()) {
			UserLoginEntity entity = modelMapper.map(dto, UserLoginEntity.class);
			entity = userLoginRepo.save(entity);
			resultDto = modelMapper.map(entity, UserSignUpResponseDto.class);
		}
		return resultDto;
	}

}
