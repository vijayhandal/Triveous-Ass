package com.triveous.service;

import com.triveous.model.Customer;
import com.triveous.model.dto.CustomerRegistrationDto;

public interface CustomerService {
    Customer registerCustomer(CustomerRegistrationDto customerDto);
    Customer loginCustomer(CustomerRegistrationDto customerDto);
}
