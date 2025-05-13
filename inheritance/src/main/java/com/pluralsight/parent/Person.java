package com.pluralsight.parent;

import java.util.Locale;

public class Person extends Object {
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " he says his age is: " + this.age;
    }

    public String getSpecialty() {
        return "I'm just a person";
    }

    public String formatName(String name) {
        return name.toUpperCase();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
