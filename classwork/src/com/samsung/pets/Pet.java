package com.samsung.pets;

import java.util.ArrayList;

public class Pet {
    private String name;
    private String nameOwner;
    private String typeOfAnimal;

    private String dateOfComing;

    ArrayList<String> datesOfComing = new ArrayList<String>();


    //---------------------------------------------------------
    // Methods
    public Pet(String name, String nameOwner, String typeOfAnimal, String dateOfComing) {
        this.typeOfAnimal = typeOfAnimal;
        this.nameOwner = nameOwner;
        this.name = name;
        this.dateOfComing = dateOfComing;
        datesOfComing.add(dateOfComing);
    }

    public String printInfo() {
        String printing = "Name: " + name + "\n" +
                "Owner: " + nameOwner + "\n" +
                "Type of animal: " + typeOfAnimal;
        return printing;
    }

    // Method for another coming
    public void anotherComing(String dayOfComing) {
        this.dateOfComing = dayOfComing;
        datesOfComing.add(dayOfComing);
    }

    // Printing of all comings
    public void printDatesOfComing() {
        for (int i = 0; i < datesOfComing.size(); i++) {
            System.out.print(i + 1 + ") ");
            System.out.print(datesOfComing.get(i));
            System.out.println();
        }
    }

    // Getter for last coming
    public String getDateOfComing() {
        return dateOfComing;
    }
}
