package com.samsung.model;

public class Student extends User implements Printer{
    private String group;
    public Student(String name, String second_name, String father_name, String phone, String group) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.phone = phone;
        this.group = group;
    }

    public Student(String name, String second_name, String father_name, String group) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.group = group;
    }

    public Student(Student student) {}

    //-----------------------------
    @Override
    public void sayHello() {
        System.out.println("Hello! I'm a student, my name is " + name);
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("Student: " + "\n"
            + "Name: " + name + "\n"
            + "Second name: " + second_name + "\n"
            + "Father name: " + father_name + "\n"
            + "Phone: " + phone + "\n"
            + "Group: " + group
        );
    }

    //------------
    // Getters
    public String getGroup() {
        return group;
    }

}
