package com.org.projectlockdownotp.service;

import org.springframework.cglib.core.internal.LoadingCache;
import org.springframework.stereotype.Service;

@Service
public class OtpService {


    //cache based on username and OPT MAX 8
    private static final Integer EXPIRE_MINS = 5;

    private LoadingCache<String, String, Integer> otpCache;

    public int generateOTP(String phoneNumber, String username) {
    }
}
