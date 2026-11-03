package com.shop.trendy.models;

public class Manger {

    private String name;
    private int age;

    public Manger() {
        System.out.println("manger class createde");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Default Name";
        } else {
            this.name = name;
        }
    }

    public void setName() {
        this.name = "Default Name";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
