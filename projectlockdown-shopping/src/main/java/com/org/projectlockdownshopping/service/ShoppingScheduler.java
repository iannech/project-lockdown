package com.org.projectlockdownshopping.service;

import com.org.projectlockdownshopping.payload.ShoppingRequest;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ShoppingScheduler {

    public void scheduleCustomerShoppingRequest(ShoppingRequest shoppingRequest) {

        // retrieve parameters
        String phoneNumber = shoppingRequest.getCustomerPhoneNumber();
        Date shopping
        // check if timeslot is available

        // schedule if time available

        // notify customer through callback

    }
}
