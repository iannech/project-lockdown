package com.org.projectlockdownotp.controller;

import com.org.projectlockdownotp.service.OtpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;

@RestController
@RequestMapping("/api/projectlockdown/v1/otp-service")
public class OtpController {

    private static Logger logger = LoggerFactory.getLogger(OtpController.class);

    @Autowired
    OtpService otpService;

    @GetMapping("/generateOtp")
    public String generateOtp(@RequestParam("phoneNumber") String phoneNumber,
                              @RequestParam("username") String username,
                              @RequestHeader("requestId") String requestId,
                              @RequestHeader HttpHeaders httpHeaders) {

        logger.info("LOG = OTP REQUEST | REQUEST_ID = {} |PHONE_NUMBER = {} | USERNAME = {}", requestId, phoneNumber, username);

        int otp = otpService.generateOTP(phoneNumber, username);

        // Send SMS or EMAIl

    }
}


