package com.app.controllers;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getlAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping(path="/{customer_id}")
    public Customer getOneCustomer(@PathVariable Long customer_id) {
        return customerRepository.findByCustomerId(customer_id);
    }

}
