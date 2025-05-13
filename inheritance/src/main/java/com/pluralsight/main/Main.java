package com.pluralsight.main;

import com.pluralsight.children.Developer;
import com.pluralsight.children.Doctor;
import com.pluralsight.parent.Animal;
import com.pluralsight.parent.Person;
import com.pluralsight.zoo.Dog;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person d1;
        d1 = new Developer("Dave", 36, "Java");
        people.add(d1);

        Person dr;
        dr = new Doctor("David", 27, "Psychaitry");
        people.add(dr);

        if(dr instanceof Object) {
            System.out.println("Yup");
        }

        for(Person p: people) {
            System.out.println("p is an instance of class: " + p.getClass() + " " + p.toString());
//            if(p instanceof Developer) {
//                System.out.println("Here p is an instance of ");
//                System.out.println(  ((Developer)p).getPreferredLanguage()  );
//            }
//            else if(p instanceof Doctor) {
//                Doctor dr2 = (Doctor)p;
//                System.out.println( dr2.getMedicalSpeciality() );
//            }
        }

    }
}
