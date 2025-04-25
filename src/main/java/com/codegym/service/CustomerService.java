package com.codegym.service;

import com.codegym.dto.CustomerNamesDto;
import com.codegym.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<CustomerNamesDto> findAll();

    Customer findById(Integer id);

    Customer find(Integer id);

    Customer add(Customer customer);

    Customer edit (Integer id ,Customer customer);

    void remove(Integer id);
}
