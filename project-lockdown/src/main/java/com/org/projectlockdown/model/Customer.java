package com.org.projectlockdown.model;

import javax.persistence.*;

@Entity
@AttributeOverride(name = "username", column = @Column(name = "username"))
@AttributeOverride( name = "phoneNumber", column = @Column(name = "phone_number"))
public class Customer extends AUser{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "physical_location")
    private String physicalLocation;

    public Customer(String username, long phoneNumber, String physicalLocation) {
        super(username, phoneNumber);
        this.physicalLocation = physicalLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    @Override
    public void signup() {
    }

    @Override
    public boolean deleteAccount() {
        return false;
    }
}
