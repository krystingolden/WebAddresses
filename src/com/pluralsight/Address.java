package com.pluralsight;

import java.util.ArrayList;

public class Address {

    private String street;
    private String city;
    private String state;
    private int zip;

    public void populateNewAddress(String street, String city, String state, int zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getAddress(){
        return (this.street + ", " + this.city + ", " + this.state + "  " + this.zip);
    }
}
