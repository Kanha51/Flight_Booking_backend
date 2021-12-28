package com.example.discount.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.example.discount.dto.DeleteDiscountDto;
import com.example.discount.dto.DiscountSave;
import com.example.discount.entity.DiscountEntity;
import com.example.discount.repository.DiscountRepository;

/**
 * The Class DiscountServiceImpl.
 */
@Service
public class DiscountServiceImpl implements DiscountService {

	/** The model mapper. */
	private final ModelMapper modelMapper;

	/** The repo. */
	private final DiscountRepository repo;

	/**
	 * Instantiates a new discount service impl.
	 *
	 * @param modelMapper the model mapper
	 * @param repo        the repo
	 */
	public DiscountServiceImpl(ModelMapper modelMapper, DiscountRepository repo) {
		this.modelMapper = modelMapper;
		this.repo = repo;
	}

	@Override
	public DiscountSave saveDiscount(DiscountSave dto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		DiscountEntity entity = modelMapper.map(dto, DiscountEntity.class);
		repo.save(entity);
		return dto;
	}

	@Override
	public List<DiscountSave> getAllDiscount() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Iterable<DiscountEntity> entityList = repo.findAll();
		List<DiscountSave> resultList = new ArrayList<>();
		for (DiscountEntity entity : entityList) {
			DiscountSave resultDto = modelMapper.map(entity, DiscountSave.class);
			resultList.add(resultDto);

		}
		return resultList;
	}

	@Override
	public DeleteDiscountDto deleteDiscount(DeleteDiscountDto dto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		repo.delete(repo.findByDiscountCode(dto.getDiscountCode()));
		return dto;
	}

	@Override
	public DiscountSave checkDiscount(DeleteDiscountDto dto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		DiscountEntity entity = repo.findByDiscountCode(dto.getDiscountCode());
		return modelMapper.map(entity, DiscountSave.class);
	}
}
