package com.org.projectlockdown.controller;

import com.org.projectlockdown.exception.ResourceNotFoundException;
import com.org.projectlockdown.model.Supermarket;
import com.org.projectlockdown.payload.ShopIdentityAvailability;
import com.org.projectlockdown.payload.ShopProfile;
import com.org.projectlockdown.payload.ShopSummarry;
import com.org.projectlockdown.repository.SupermarketRepository;
import com.org.projectlockdown.security.CurrentUser;
import com.org.projectlockdown.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="api/lockdown/supermarket")
public class SupermarketController {

    @Autowired
    SupermarketRepository supermarketRepository;

    @GetMapping(value = "/profile")
    @PreAuthorize("hasAnyRole('SUPERMARKET')")
    public ShopSummarry getSupermarketProfile(@CurrentUser UserPrincipal currentUser) {

        ShopSummarry shopSummarry = new ShopSummarry(currentUser.getId(), currentUser.getBranchName(),
                currentUser.getPhysicalLocation());

        return shopSummarry;
    }

    @GetMapping(value = "/checkBranchNameAvailability")
    public ShopIdentityAvailability checkBranchNameAvailability(@RequestParam("branchName") String branchName) {

        Boolean isAvailable = !supermarketRepository.existsByBranchName(branchName);

        return new ShopIdentityAvailability(isAvailable);
    }

    @GetMapping(value = "/{branchName}")
    public ShopProfile getSupermarketBranchProfile(@RequestParam("branchName") String branchName) {

       Supermarket supermarket = supermarketRepository.findByBranchName(branchName)
               .orElseThrow(()-> new ResourceNotFoundException("Supermarket", "branchName", branchName));

        ShopProfile shopProfile = new ShopProfile(supermarket.getShopName(), supermarket.getPhoneNumber(), supermarket.getBusinessType(),
                supermarket.getBranchName(), supermarket.getPhysicalLocation());

       return shopProfile;

    }
}