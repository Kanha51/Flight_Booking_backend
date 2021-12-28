package com.example.discount.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.discount.dto.DeleteDiscountDto;
import com.example.discount.dto.DiscountSave;
import com.example.discount.service.DiscountService;
import com.example.discount.util.DiscountConstant;

/**
 * The Class DiscountController.
 */
@RestController
@RequestMapping(DiscountConstant.URL_DISCOUNT)
@CrossOrigin(origins = "*")
public class DiscountController {

	/** The service. */
	private final DiscountService service;

	/**
	 * Instantiates a new discount controller.
	 *
	 * @param service the service
	 */
	public DiscountController(DiscountService service) {
		this.service = service;
	}

	/**
	 * Save discount.
	 *
	 * @param dto the dto
	 * @return the response entity
	 */
	@PostMapping(DiscountConstant.URL_SAVE)
	public ResponseEntity<DiscountSave> saveDiscount(@RequestBody DiscountSave dto) {
		return ResponseEntity.ok(service.saveDiscount(dto));
	}

	/**
	 * Gets the all discount.
	 *
	 * @return the all discount
	 */
	@GetMapping(DiscountConstant.URL_GET)
	public ResponseEntity<List<DiscountSave>> getAllDiscount() {
		return ResponseEntity.ok(service.getAllDiscount());
	}

	/**
	 * Delete discount.
	 *
	 * @param dto the dto
	 * @return the response entity
	 */
	@PostMapping(DiscountConstant.URL_DELETE)
	public ResponseEntity<DeleteDiscountDto> deleteDiscount(@RequestBody DeleteDiscountDto dto) {
		return ResponseEntity.ok(service.deleteDiscount(dto));
	}

	/**
	 * Check discount.
	 *
	 * @param dto the dto
	 * @return the response entity
	 */
	@PostMapping(DiscountConstant.CHECK_DISCOUNT)
	public ResponseEntity<DiscountSave> checkDiscount(@RequestBody DeleteDiscountDto dto) {
		return ResponseEntity.ok(service.checkDiscount(dto));
	}
}
