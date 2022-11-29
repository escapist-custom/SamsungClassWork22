package com.samsung.model;

public abstract class User {
    protected String name;
    protected String second_name;
    protected String father_name;
    protected String phone;

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
