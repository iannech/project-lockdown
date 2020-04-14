package com.org.projectlockdown.location.controller;

import com.google.maps.model.LatLng;
import com.org.projectlockdown.location.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/lockdown")
public class LocationServicesController {

    private static final Logger logger = LoggerFactory.getLogger(LocationServicesController.class);

    @Autowired
    LocationService locationService;

    @GetMapping(value = "/nearestSupermarkets")
    public ResponseEntity<?> getNearestSupermarkets(@RequestHeader HttpHeaders httpHeaders,
                                                    @RequestParam("businessType") String businessType,
                                                    @RequestParam("currentLocation") String currentLocation,
                                                    @RequestParam("phoneNumber") String phoneNumber) {


        String [] latLong = currentLocation.split(",");
        double latitude = Double.parseDouble(latLong[0]);
        double longitude = Double.parseDouble(latLong[1]);

        LatLng myLocation = new LatLng(latitude, longitude);

        locationService.getNearestShops(businessType, myLocation);

        return new ResponseEntity<>();
    }
}
