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

    public Long getPassangerDetailsId() {
        return passangerDetailsId;
    }

    public void setPassangerDetailsId(Long passangerDetailsId) {
        this.passangerDetailsId = passangerDetailsId;
    }
}
