package com.samsung;

import com.samsung.pets.Pet;

public class App {
    public static void main(String[] args) {
        Pet pet = new Pet("John", "Ivan", "Dog", "27.05.2007");
        Pet pet2 = new Pet("Myrsic", "Tom", "Cat", "12.04.2022");
        Pet pet3 = new Pet("Dori", "Jeff", "Fish", "08.12.2023");
        Pet pet4 = new Pet("Peter", "Dima", "spider", "23.06.2020");

        pet.anotherComing("24.05.2018");

        System.out.println(pet.getDateOfComing());

        pet.printDatesOfComing();
    }
}