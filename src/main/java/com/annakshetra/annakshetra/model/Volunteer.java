package com.annakshetra.annakshetra.model;

import jakarta.persistence.*;

@Entity
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String address;

    private String availability; // Example: "Mon-Fri 9AM-5PM"

    private String assignedPickups;  // Optional: can be handled by Pickup entity later
    private String assignedDeliveries;  // Same here

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getAssignedPickups() {
        return assignedPickups;
    }

    public void setAssignedPickups(String assignedPickups) {
        this.assignedPickups = assignedPickups;
    }

    public String getAssignedDeliveries() {
        return assignedDeliveries;
    }

    public void setAssignedDeliveries(String assignedDeliveries) {
        this.assignedDeliveries = assignedDeliveries;
    }
}
