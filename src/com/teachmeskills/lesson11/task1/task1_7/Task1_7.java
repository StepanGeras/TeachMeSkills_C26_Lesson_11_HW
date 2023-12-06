package com.teachmeskills.lesson11.task1.task1_7;

public class Task1_7 {

    public static void doEndsWith (String documentNumber) {

        String string = "1a2b";

        if (documentNumber.endsWith(string)) {
            System.out.println("Number ends with " + string);
        } else {
            System.out.println("The number does not end with " + string);
        }

    }

}
