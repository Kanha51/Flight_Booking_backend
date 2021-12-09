package com.example.users.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The type Passanger detail entity.
 */
@Entity
@Table(name = "PASSANGER_DETAIL")
@Data
public class PassangerDetailEntity implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Passanger details id.
     */
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passangerDetailsId;

    /**
     * The Flight booking id.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private UserLoginEntity userId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FLIGHT_ID", referencedColumnName = "FLIGHT_ID")
    private FlightBookingDetailEntity flightId;

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


    public PassangerDetailEntity() {
        super();

    }

    public Long getPassangerDetailsId() {
        return passangerDetailsId;
    }

    public void setPassangerDetailsId(Long passangerDetailsId) {
        this.passangerDetailsId = passangerDetailsId;
    }

    public UserLoginEntity getUserId() {
        return userId;
    }

    public void setUserId(UserLoginEntity userId) {
        this.userId = userId;
    }

    public FlightBookingDetailEntity getFlightId() {
        return flightId;
    }

    public void setFlightId(FlightBookingDetailEntity flightId) {
        this.flightId = flightId;
    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public String getPassangerGender() {
        return passangerGender;
    }

    public void setPassangerGender(String passangerGender) {
        this.passangerGender = passangerGender;
    }

    public int getPassangerAge() {
        return passangerAge;
    }

    public void setPassangerAge(int passangerAge) {
        this.passangerAge = passangerAge;
    }
}
