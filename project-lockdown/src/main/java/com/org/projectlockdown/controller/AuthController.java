package com.org.projectlockdown.controller;

import com.org.projectlockdown.model.Customer;
import com.org.projectlockdown.model.Supermarket;
import com.org.projectlockdown.payload.ApiResponse;
import com.org.projectlockdown.repository.CustomerRepository;
import com.org.projectlockdown.repository.SupermarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/lockdown")
public class AuthController {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    SupermarketRepository supermarketRepository;


    @PostMapping("/customer/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody Customer customerSignupRequest) {

        if(customerRepository.existsByPhoneNumber(customerSignupRequest.getPhoneNumber())){
            return new ResponseEntity(new ApiResponse(false, "Phone number is already registered!"),
                    HttpStatus.BAD_REQUEST);
        }



    }

    @PostMapping("/supermarket/signup")
    public ResponseEntity<?> registerBusinessEntity(@Valid @RequestBody Supermarket supermarketSignupRequest) {

    }


    //TODO
    // Authentication to be done by OTP Service

}