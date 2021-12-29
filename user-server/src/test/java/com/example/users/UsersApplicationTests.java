package com.example.users;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.users.dto.UserSignUpDto;
import com.example.users.dto.UserSignUpResponseDto;
import com.example.users.entity.FlightBookingDetailEntity;
import com.example.users.entity.UserLoginEntity;
import com.example.users.repository.FlightBookingDetailRepository;
import com.example.users.repository.UserLoginRepository;
import com.example.users.service.UserServiceImpl;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class UsersApplicationTests {

	@InjectMocks
	private UserServiceImpl service;

	@Mock
	private FlightBookingDetailRepository flightBookingDetailRepository;

	@Mock
	private FlightBookingDetailEntity entity;
	@Mock
	private UserSignUpDto signUpDto;
	@Mock
	private UserLoginEntity userEntity;
	@Mock
	private ModelMapper modelMapper;
	@Mock
	private UserLoginRepository userLoginRepo;
	@Mock
	private UserSignUpResponseDto signUpReponseDto;

	@Test
	void cancelTicketTest() {
		when(flightBookingDetailRepository.findByPnrNo(Mockito.anyString())).thenReturn(entity);
		assertNotNull(service.cancelTicket(Mockito.anyString()));
	}

	@Test
	void userSignUpTest() {
		when(userLoginRepo.findByEmailId(Mockito.anyString())).thenReturn(null);
		when(userLoginRepo.save(userEntity)).thenReturn(userEntity);
		when(modelMapper.map(signUpDto, UserLoginEntity.class)).thenReturn(userEntity);
		when(modelMapper.map(userEntity, UserSignUpResponseDto.class)).thenReturn(signUpReponseDto);
		assertNotNull(service.userSignUp(signUpDto));

	}
}
