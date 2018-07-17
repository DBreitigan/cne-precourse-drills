package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable{
    private final String name;
    private final ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
        addresses = new ArrayList<>();
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }

    public String getName() {
        return name;
    }
}
