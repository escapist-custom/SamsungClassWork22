package com.samsung.model;

public abstract class User {
    private String name;
    private String second_name;
    private String father_name;
    private String phone;

    public void sayHello() {
        System.out.println("Hello world!");
    };

    //--------------------------------
    // Getters
    public String getName() {
        return name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getFather_name() {
        return father_name;
    }
}
