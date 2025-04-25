package com.codegym.repository;

import com.codegym.entity.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> selectAll();

    Customer select(Integer id);

    Customer insert(Customer customer);

    Customer update(Integer id, Customer customer);

    void delete(Integer id);
}
