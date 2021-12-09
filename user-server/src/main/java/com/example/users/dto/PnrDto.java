package com.example.users.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * The type Pnr dto.
 */
@Data
public class PnrDto implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Pnr no.
     */
    private String pnrNo;
}
