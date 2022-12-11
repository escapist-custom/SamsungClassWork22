package com.samsung.model;

public class University implements Printer{
    protected String address;
    protected String name;
    protected Student[] students;
    protected Teacher[] teachers;

    public University(String name, String address, Student[] students, Teacher[] teachers) {
        this.name = name;
        this.address = address;
        this.students = new Student[students.length];
        for (int i = 0; i < this.students.length; i++) {
            this.students[i] = students[i];
        }
        this.teachers = new Teacher[teachers.length];
        for (int i = 0; i < this.teachers.length; i++) {
            this.teachers[i] = teachers[i];
        }
    }
    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("University: " + "\n"
            + "Name: " + name + "\n"
            + "Address: " + address
        );
        System.out.println("\n" + "STUDENTS: ");
        for (int i = 0; i < students.length; i++) {
            students[i].printInfoToConsoleSuperKpacuBo();
            System.out.println();
        }

        System.out.println("TEACHERS: ");
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].printInfoToConsoleSuperKpacuBo();
            System.out.println();
        }
    }

    //--------------
    // Getters
    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }
}
