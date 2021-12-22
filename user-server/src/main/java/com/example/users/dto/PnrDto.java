package com.example.users.dto;

import java.io.Serializable;

import lombok.Data;

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

	/**
	 * Gets the serial version UID.
	 *
	 * @return the serial version UID
	 */
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * Gets the pnr no.
	 *
	 * @return the pnr no
	 */
	public String getPnrNo() {
		return pnrNo;
	}

	/**
	 * Sets the pnr no.
	 *
	 * @param pnrNo the new pnr no
	 */
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
}
