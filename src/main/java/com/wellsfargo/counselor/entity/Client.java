package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Id
    private long advisorId;

    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(long advisorId, String lastName, String email) {
        this.advisorId = advisorId;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getAdvisorId() {
        return advisorId;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
