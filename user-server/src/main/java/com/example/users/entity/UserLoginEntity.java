package com.example.users.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "User_Login")
@Data
public class UserLoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;
    @Column(nullable = false)
    private String fName;
    @Column(unique = true, nullable = false)
    private String emailId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String lName;

    public UserLoginEntity(Long id) {
        this.id = id;
    }

    public UserLoginEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}