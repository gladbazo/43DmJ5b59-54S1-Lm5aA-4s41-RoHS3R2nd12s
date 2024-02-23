package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class GasStation {
    @Id
    private String id;
    private String name;
    private String brand;
    private String street;
    private String place;
    private double lat;
    private double lng;
    private double dist;
    private BigDecimal diesel;
    private BigDecimal e5;
    private BigDecimal e10;
    private boolean isOpen;
    private String houseNumber;
    private int postCode;

    public GasStation() {
    }

    public GasStation(String id, String name, String brand, String street, String place, double lat, double lng, double dist, BigDecimal diesel, BigDecimal e5, BigDecimal e10, boolean isOpen, String houseNumber, int postCode) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.street = street;
        this.place = place;
        this.lat = lat;
        this.lng = lng;
        this.dist = dist;
        this.diesel = diesel;
        this.e5 = e5;
        this.e10 = e10;
        this.isOpen = isOpen;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return this.lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getDist() {
        return this.dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public BigDecimal getDiesel() {
        return this.diesel;
    }

    public void setDiesel(BigDecimal diesel) {
        this.diesel = diesel;
    }

    public BigDecimal getE5() {
        return this.e5;
    }

    public void setE5(BigDecimal e5) {
        this.e5 = e5;
    }

    public BigDecimal getE10() {
        return this.e10;
    }

    public void setE10(BigDecimal e10) {
        this.e10 = e10;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getPostCode() {
        return this.postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String toString() {
        return "GasStation{id='" + this.id + "', name='" + this.name + "', brand='" + this.brand + "', street='" + this.street + "', place='" + this.place + "', lat=" + this.lat + ", lng=" + this.lng + ", dist=" + this.dist + ", diesel=" + this.diesel + ", e5=" + this.e5 + ", e10=" + this.e10 + ", isOpen=" + this.isOpen + ", houseNumber='" + this.houseNumber + "', postCode=" + this.postCode + "}";
    }
}
