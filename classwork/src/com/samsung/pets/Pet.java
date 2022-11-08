package com.samsung.pets;

public class Pet {
    private String name;
    private String nameOwner;
    private String typeOfAnimal;

    public Pet(String name, String nameOwner, String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
        this.nameOwner = nameOwner;
        this.name = name;
    }

    public String printInfo() {
        String printing = "Name: " + name + "\n" +
                "Owner: " + nameOwner + "\n" +
                "Type of animal: " + typeOfAnimal;
        return printing;
    }
}
