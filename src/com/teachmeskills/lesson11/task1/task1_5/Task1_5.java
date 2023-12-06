package com.teachmeskills.lesson11.task1.task1_5;

import java.util.Objects;

public class Task1_5 {

    public static void doIndexOf (String documentNumber) {

        String[] arrayString = documentNumber.split("-");

        String stringLowerCase = "abc";

        boolean count = false;

        for (int i = 0; i < arrayString.length; i++) {

            if (arrayString[i].equalsIgnoreCase(stringLowerCase)){
                count = true;
            }

        }

        if (count) {
            System.out.println("abc is in this line");
        } else {
            System.out.println("abc is not in this line");
        }

    }

}
