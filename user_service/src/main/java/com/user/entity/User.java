package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userId;
    private String name;

    private String phone;

    List<Contact> contacts = new ArrayList<>();
    // we will load a list of contacts using another microservice

    // id you have list of contacts you can give list of contacts as well for initialization
    public User(Long userId, String name, String phone, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }


   // if you have id name phone you can initialize data to object using below constructor
    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    // if you do not have anything you can use default constructor
    public User() {

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
