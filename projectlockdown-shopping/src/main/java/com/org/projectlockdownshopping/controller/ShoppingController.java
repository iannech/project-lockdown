package com.org.projectlockdownshopping.controller;

import com.org.projectlockdownshopping.payload.ShoppingRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/api/projectlockdown/v1/shopping")
public class ShoppingController {

    private static final Logger log = LoggerFactory.getLogger(ShoppingController.class);

    @PostMapping("/schedule")
    public ResponseEntity<?> scheduleShoppingTime(@Valid @RequestBody ShoppingRequest shoppingRequest,
                                                  @RequestHeader HttpHeaders httpHeaders) {

    }


    @GetMapping("/availableTimeSlots")
    public ResponseEntity<?> getAvailableTimeSlots(@RequestHeader HttpHeaders httpHeaders) {

    }

    @GetMapping("/isTimeAvailable")
    public ResponseEntity<?> checkIfTimeIsAvailable(@RequestParam(value = "time") Date time,
                                                    @RequestHeader HttpHeaders httpHeaders) {

    }

}
