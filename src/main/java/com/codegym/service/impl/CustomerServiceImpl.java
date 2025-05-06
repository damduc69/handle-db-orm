package com.codegym.service.impl;

import com.codegym.dto.CustomerNamesDto;
import com.codegym.entity.Customer;
import com.codegym.repository.CustomerRepository;
import com.codegym.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerNamesDto> findAll() {
        List<Customer> customerEntities = customerRepository.selectAll();
        List<CustomerNamesDto> customerNamesDtos = new ArrayList<>();
        for (Customer entity: customerEntities) {
            CustomerNamesDto dto = new CustomerNamesDto();
            dto.setId(entity.getId());
            dto.setName(entity.getFullName());
            customerNamesDtos.add(dto);
        }
        return customerNamesDtos;
    }

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public Customer find(Integer id) {
        return null;
    }

    @Override
    public Customer add(Customer customer) {
        return null;
    }

    @Override
    public Customer edit(Integer id, Customer customer) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
