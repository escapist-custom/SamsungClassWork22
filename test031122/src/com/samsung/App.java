package com.samsung;

import com.samsung.model.Person;

public class App {
    public static void main(String[] args) {

        Person person = new Person("John", 15);
        Person person1 = new Person(person);

        person.printInfo();

        person1.setAge(19);

        person1.printInfo();
        person.printInfo();


    }
}