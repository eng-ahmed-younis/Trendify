package com.shop.trendy.models;

public class Employee {
    private final Manger manger;

    public Employee(Manger manger) {
        this.manger = manger;
    }

    public void showMangrData() {
        System.out.println(manger.getName() + " " + manger.getAge());
    }
}
