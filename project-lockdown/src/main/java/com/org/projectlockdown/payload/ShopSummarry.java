package com.org.projectlockdown.payload;

public class ShopSummarry {

    private Long id;

    private String branchName;

    private String physicalLocation;


    public ShopSummarry(Long id, String branchName, String physicalLocation) {
        this.id = id;
        this.branchName = branchName;
        this.physicalLocation = physicalLocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }
}
