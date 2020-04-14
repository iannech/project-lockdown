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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "api/lockdown")
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

        Customer result = customerRepository.save(customerSignupRequest);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/lockdown/users/{username}")
                .buildAndExpand(result.getUsername()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true,  "User registered successfully."));
    }

    @PostMapping("/supermarket/signup")
    public ResponseEntity<?> registerBusinessEntity(@Valid @RequestBody Supermarket supermarketSignupRequest) {

        if(supermarketRepository.existsByBranchName(supermarketSignupRequest.getBranchName())){
            return new ResponseEntity(new ApiResponse(false, "Branch name is already registered!"),
                    HttpStatus.BAD_REQUEST);
        }

        Supermarket result = supermarketRepository.save(supermarketSignupRequest);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/lockdown/supermarkets/{branchName}")
                .buildAndExpand(result.getBranchName()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true,  "Branch registered successfully."));
    }



}