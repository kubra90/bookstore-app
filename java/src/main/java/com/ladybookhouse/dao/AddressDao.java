package com.ladybookhouse.dao;

import com.ladybookhouse.model.Address;

import java.util.List;

public interface AddressDao {

     List<Address> getAddressesByEmail(String Email);
}
