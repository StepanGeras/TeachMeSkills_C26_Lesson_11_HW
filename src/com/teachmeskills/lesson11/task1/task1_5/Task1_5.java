package com.teachmeskills.lesson11.task1.task1_5;

public class Task1_5 {

    public static void doIndexOf (String documentNumber) {

        String[] arrayString = documentNumber.split("-");

        String stringLowerCase = "abc";

        boolean count = false;

        for (String string : arrayString) {

            if (string.equalsIgnoreCase(stringLowerCase)) {
                count = true;
                break;
            }

        }

        if (count) {
            System.out.println("abc is in this line");
        } else {
            System.out.println("abc is not in this line");
        }

    }

}
