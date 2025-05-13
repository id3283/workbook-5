package com.pluralsight.children;

import com.pluralsight.parent.Person;

public class Doctor extends Person {
    String medicalSpeciality;

    public Doctor(String name, int age, String medicalSpeciality) {
        super(name, age);
        this.medicalSpeciality = medicalSpeciality;
    }

    @Override
    public String toString() {
        return "I'm a freakin' doctor.";
    }

    public String getMedicalSpeciality() {
        return medicalSpeciality;
    }


    @Override
    public String getSpecialty() {
        return "My medical speciality is: " + this.medicalSpeciality;
    }
}
