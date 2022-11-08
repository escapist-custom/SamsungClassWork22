package com.samsung;

import com.samsung.pets.Pet;

public class App {
    public static void main(String[] args) {
        Pet pet = new Pet("John", "Ivan", "Dog");
        Pet pet2 = new Pet("Myrsic", "Tom", "Cat");
        Pet pet3 = new Pet("Dori", "Jeff", "Fish");
        Pet pet4 = new Pet("Peter", "Dima", "spider");
        System.out.println(pet.printInfo());
        System.out.println();
        System.out.println(pet2.printInfo());
        System.out.println();
        System.out.println(pet3.printInfo());
        System.out.println();
        System.out.println(pet4.printInfo());
    }
}