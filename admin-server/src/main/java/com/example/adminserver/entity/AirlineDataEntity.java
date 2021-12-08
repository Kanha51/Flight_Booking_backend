package com.example.adminserver.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * The Class AirlineDataEntity.
 */
@Entity
@Table(name = "Airline_Data")
@Data
public class AirlineDataEntity {

    /**
     * The id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String uniqueId;
    /**
     * The airline name.
     */
    @Column(unique = true, nullable = false)
    private String airlineName;

    /**
     * The logo.
     */
    @Column(unique = true, nullable = false)
    private Byte logo;

    /**
     * The block.
     */
    private Integer block = 0;

    /**
     * The contact no.
     */
    @Column(unique = true, nullable = false)
    private Long contactNo;

    /**
     * The airline address.
     */
    @Column(unique = true, nullable = false)
    private String airlineAddress;

    /**
     * Instantiates a new airline data entity.
     */
    public AirlineDataEntity() {
    }

    /**
     * Instantiates a new airline data entity.
     *
     * @param id the id
     */
    public AirlineDataEntity(Long id) {
        super();
        this.id = id;
    }

    /**
     * Gets the block.
     *
     * @return the block
     */
    public Integer getBlock() {
        return block;
    }

    /**
     * Sets the block.
     *
     * @param block the new block
     */
    public void setBlock(Integer block) {
        this.block = block;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the airline name.
     *
     * @return the airline name
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the airline name.
     *
     * @param airlineName the new airline name
     */
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    /**
     * Gets the logo.
     *
     * @return the logo
     */
    public Byte getLogo() {
        return logo;
    }

    /**
     * Sets the logo.
     *
     * @param logo the new logo
     */
    public void setLogo(Byte logo) {
        this.logo = logo;
    }

    /**
     * Gets the contact no.
     *
     * @return the contact no
     */
    public Long getContactNo() {
        return contactNo;
    }

    /**
     * Sets the contact no.
     *
     * @param contactNo the new contact no
     */
    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * Gets the airline address.
     *
     * @return the airline address
     */
    public String getAirlineAddress() {
        return airlineAddress;
    }

    /**
     * Sets the airline address.
     *
     * @param airlineAddress the new airline address
     */
    public void setAirlineAddress(String airlineAddress) {
        this.airlineAddress = airlineAddress;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
