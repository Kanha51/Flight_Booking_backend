package com.example.adminserver.dto;

public class AirlineDataResponseDto {

    private String uniqueId;
    /**
     * The airline name.
     */
    private String airlineName;

    /**
     * The logo.
     */
    private Byte logo;

    /**
     * The contact no.
     */
    private Long contactNo;

    /**
     * The airline address.
     */
    private String airlineAddress;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public Byte getLogo() {
        return logo;
    }

    public void setLogo(Byte logo) {
        this.logo = logo;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    public String getAirlineAddress() {
        return airlineAddress;
    }

    public void setAirlineAddress(String airlineAddress) {
        this.airlineAddress = airlineAddress;
    }
}
