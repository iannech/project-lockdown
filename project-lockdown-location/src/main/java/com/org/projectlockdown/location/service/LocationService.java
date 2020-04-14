package com.org.projectlockdown.location.service;

import com.google.maps.model.LatLng;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    public static final String GOOGLE_PLACE_API_KEY = "ADD_YOUR_API_KEY_HERE";

    public static String base_url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?query=";

    public void getNearestShops(String businessType, LatLng myCurrentLocation) {


    }
}
