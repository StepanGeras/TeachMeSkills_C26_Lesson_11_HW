package com.teachmeskills.lesson11.task1.task1_6;

public class Task1_6 {

    public static void doStartsWith (String documentNumber) {

        String string = "555";

        if (documentNumber.startsWith(string)) {
            System.out.println("Number starts with " + string);
        } else {
            System.out.println("The number doesn't start with " + string);
        }

    }

}
