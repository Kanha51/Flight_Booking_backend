package com.example.users.service;

import com.example.users.dto.*;

import java.util.List;

public interface UserService {
    PnrDto bookTicket(FlightBookingDto bookingDetail);

    UserFlightStatusDto cancelTicket(String pnrNo);

    List<FlightHistoryDto> getFlightHistory(FlightHistoryRequestDto dto);
}
