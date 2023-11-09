package com.triveous.service.impl;

import com.triveous.model.Customer;
import com.triveous.model.dto.CustomerRegistrationDto;
import com.triveous.repository.CustomerRepository;
import com.triveous.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Customer registerCustomer(CustomerRegistrationDto customerDto) {
        Customer newCustomer = new Customer();
        newCustomer.setUsername(customerDto.getUsername());
        newCustomer.setPassword(passwordEncoder.encode(customerDto.getPassword()));

        return customerRepository.save(newCustomer);
    }

    @Override
    public Customer loginCustomer(CustomerRegistrationDto customerDto) {

        return customerRepository.findByUsername(customerDto.getUsername()).orElse(null);
    }
}
