package com.samsung.model;

public class Person {
    String def = "4"; // default variable
    private String name;
    private int age;

    protected String color;

    //---------------------------
    // constructor of coping
    public Person(Person person) {
        this.name = person.getName();
    }
    //-----------------------------
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }
    /*
    public int getAge() {
        return age;
    }*/

    public void setAge(int age) {
        if (age > 0 && age < 150) this.age = age;
    }
}
