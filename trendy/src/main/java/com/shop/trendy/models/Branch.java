package com.shop.trendy.models;

public class Branch {

    private String branchName;
    private String city;

    public Branch() {
    }

    public Branch(String branchName, String city) {
        this.branchName = branchName;
        this.city = city;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Branch [branchName=" + branchName + ", city=" + city + "]";
    }
}

