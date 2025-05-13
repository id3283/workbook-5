package com.pluralsight.children;

import com.pluralsight.parent.Person;

public class Developer extends Person {
    String preferredLanguage;

    public Developer() {
        super();
    }

    public Developer(String name, int age, String preferredLanguage) {
        super(name, age);
        this.preferredLanguage = preferredLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + " Coding language: " + this.preferredLanguage;
    }

    @Override
    public String getSpecialty() {
        return "I specialize in " + this.preferredLanguage;
    }


    public String getPreferredLanguage() {
        return preferredLanguage;
    }
    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

}
