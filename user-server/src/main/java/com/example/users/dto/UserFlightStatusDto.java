package com.example.users.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * The type User flight status dto.
 */
@Data
public class UserFlightStatusDto implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Status.
     */
    private String status;
}
