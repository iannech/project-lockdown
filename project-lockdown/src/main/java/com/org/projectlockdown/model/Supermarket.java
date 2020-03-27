package com.org.projectlockdown.model;


import javax.persistence.*;

@Entity
@AttributeOverride(name = "shopName", column = @Column(name = "shop_name"))
@AttributeOverride( name = "phoneNumber", column = @Column(name = "phone_number"))
@AttributeOverride( name = "businessType", column = @Column(name = "business_type"))
@AttributeOverride( name = "physicalLocation", column = @Column(name = "physical_location"))
public class Supermarket extends AShop{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String branchName;

    public Supermarket(String shopName, long phoneNumber, String businessType, String physicalLocation, String branchName) {
        super(shopName, phoneNumber, businessType, physicalLocation);
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

    @Override
    public void signup() {

    }

    @Override
    public boolean deleteAccount() {
        return false;
    }


}
