package de.neuefische.web;

import de.neuefische.java.Person;

public class Main {

    public static void main(String[] args) {
        Person florian = new Person();
        Person ursula = new Person();

        florian.setName("florian");
        florian.setAge(1);

        ursula.setName("florian");

        System.out.println(florian.toString());
        System.out.println(ursula);

        if (florian.equals(ursula)) {
            System.out.println("Yes they are equal!");
        }
        else {
            System.out.println("No they are not equal!");
        }
    }
}
