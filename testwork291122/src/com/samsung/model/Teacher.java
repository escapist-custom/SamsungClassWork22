package com.samsung.model;

public class Teacher extends User implements Printer{
    protected String[] subjects;

    public Teacher(String name, String second_name, String father_name, String phone, String[] subjects) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.phone = phone;
        this.subjects = new String[subjects.length];
        for (int i = 0; i < this.subjects.length; i++) {
            this.subjects[i] = subjects[i];
        }
    }

    public Teacher(String name, String second_name, String father_name, String[] subjects) {
        this.name = name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.subjects = new String[subjects.length];
        for (int i = 0; i < this.subjects.length; i++) {
            this.subjects[i] = subjects[i]; 
        }
    }

    public Teacher(Teacher teacher) {
        this.subjects = new String[teacher.subjects.length];
        for (int i = 0; i < subjects.length; i++) {
            this.subjects[i] = teacher.subjects[i];
        }
    }

    //------------------
    // Methods
    public void sayHello() {
        System.out.println("Здравствуйте! Я преподаватель, мое имя " + name);
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.print("Teacher: " + "\n"
            + "Name: " + name + "\n"
            + "Second name: " + second_name + "\n"
            + "Father name: " + father_name + "\n"
            + "Phone: " + phone + "\n"
            + "Subjects: "
        );
        for (int i = 0; i < subjects.length; i++) {
            if (i + 1 < subjects.length) System.out.print(subjects[i] + ", ");
            else System.out.println(subjects[i] + ".");
        }
    }

    //-----------------
    // Getter
    public String[] getSubjects() {
        return subjects;
    }
}
