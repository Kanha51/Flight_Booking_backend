package com.example.adminserver.dto;

public class FlightScheduleResponseDto {

    private String flightNo;

    public FlightScheduleResponseDto(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }
}
