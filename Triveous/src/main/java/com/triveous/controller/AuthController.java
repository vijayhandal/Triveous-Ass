package com.triveous.controller;

import com.triveous.exception.CustomerExistsException;
import com.triveous.exception.CustomerNotFoundException;
import com.triveous.model.dto.CustomerRegistrationDto;
import com.triveous.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody CustomerRegistrationDto customerDto) throws CustomerExistsException {
    	 customerService.registerCustomer(customerDto);
		 return ResponseEntity.ok("Customer registered successfully!");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody CustomerRegistrationDto customerDto) throws CustomerNotFoundException {
		 customerService.loginCustomer(customerDto);
		 return ResponseEntity.ok("Customer logged in successfully!");
    }
}
