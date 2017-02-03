package com.galvanize;

import java.util.ArrayList;

public class Business implements Addressable {
  private final String name;
  private final ArrayList<Address> addresses = new ArrayList<Address>();

  public Business(String newName) {
    name = newName;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Address> getAddresses() {
    return addresses;
  }

  public void addAddress(Address newAddress) {
    addresses.add(newAddress);
  }

}
