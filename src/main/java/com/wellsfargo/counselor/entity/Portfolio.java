package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Id
    private long clientId;

    @Column(nullable = false)
    private String creationDate;
    @Column(nullable = false)
    private int size;

    protected Portfolio() {

    }

    public Portfolio(long clientId, String creationDate, int size) {
        this.clientId = clientId;
        this.creationDate = creationDate;
        this.size = size;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
