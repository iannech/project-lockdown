package com.org.projectlockdown.controller;

import com.org.projectlockdown.payload.CallbackResponse;
import com.org.projectlockdown.payload.ScheduleShoppingResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/lockdown")
public class ScheduleShoppingController {


    @PostMapping(value = "/schedule-shopping")
    public ScheduleShoppingResponse scheduleShoppingTime() {


    }

    @PostMapping(value = "/schedule-shopping/callback")
    public CallbackResponse scheduleShoppingCallback() {


    }
}
