package com.example.users.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class FlightPassangerInfoDto implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The Passanger name.
     */
    private String passangerName;

    /**
     * The Passanger gender.
     */
    private String passangerGender;

    /**
     * The Passanger age.
     */
    private int passangerAge;

}
