package com.org.projectlockdown.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AttributeOverride(name = "shopName", column = @Column(name = "shop_name"))
@AttributeOverride( name = "phoneNumber", column = @Column(name = "phone_number"))
@AttributeOverride( name = "businessType", column = @Column(name = "business_type"))
@AttributeOverride( name = "physicalLocation", column = @Column(name = "physical_location"))
@AttributeOverride( name = "password", column = @Column(name = "password"))
public class Supermarket extends AShop{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String branchName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();


    public Supermarket(String shopName, long phoneNumber, String businessType, String physicalLocation, String branchName, String password) {
        super(shopName, phoneNumber, businessType, physicalLocation,password);
        this.branchName = branchName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public void signup() {

    }

    @Override
    public boolean deleteAccount() {
        return false;
    }


}
