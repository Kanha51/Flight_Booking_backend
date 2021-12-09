package com.example.users.dto;

import java.util.List;

import lombok.Data;

@Data
public class FlightInfoList {

	private List<FlightSearchResultDto> flightList;
}
