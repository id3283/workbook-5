package com.pluralsight.zoo;

public class Dog extends Animal {
    private String breed;

    public Dog() {
        super();
        System.out.println("Trace -- in Dog() class");
    }
    public Dog(String name, String breed) {
        super(name);
        System.out.println(
                "Trace -- in Dog(name, breed) class w/ name");
        this.breed = breed;
    }

    public Dog(String name) {
        super(name);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void bark() {
        System.out.println("Ruff, ruff!");
    }
}