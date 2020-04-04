package com.org.projectlockdown.security;

import com.org.projectlockdown.model.Supermarket;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserPrincipal implements UserDetails {

    private long id;

    private String shopName;

    private long phoneNumber;

    private String businessType;

    private String branchName;

    private String password;

    private String physicalLocation;

    private Collection<? extends GrantedAuthority> authorities;

    public UserPrincipal(long id, String shopName, long phoneNumber, String businessType, String branchName,
                         String password, Collection<? extends GrantedAuthority> authorities, String physicalLocation) {
        this.id = id;
        this.shopName = shopName;
        this.phoneNumber = phoneNumber;
        this.businessType = businessType;
        this.branchName = branchName;
        this.password = password;
        this.authorities = authorities;
        this.physicalLocation = physicalLocation;
    }

    public static UserPrincipal create(Supermarket supermarket) {
        List<GrantedAuthority> authorities = supermarket.getRoles().stream().map(role ->
                new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());

        return new UserPrincipal(
                supermarket.getId(),
                supermarket.getShopName(),
                supermarket.getPhoneNumber(),
                supermarket.getBusinessType(),
                supermarket.getBranchName(),
                supermarket.getPassword(),
                authorities,
                supermarket.getPhysicalLocation()
        );
    }

    public long getId() {
        return id;
    }

    public String getShopName() {
        return shopName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getBusinessType() {
        return businessType;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return branchName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        UserPrincipal that = (UserPrincipal) obj;
        return Objects.equals(id, that.id);
    }
}
