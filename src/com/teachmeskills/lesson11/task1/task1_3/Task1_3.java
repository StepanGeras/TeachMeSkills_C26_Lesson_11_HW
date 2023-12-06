package com.teachmeskills.lesson11.task1.task1_3;

public class Task1_3 {

    public static void doLowerCase (String documentNumber) {

        StringBuilder stringBuilder = new StringBuilder(documentNumber.toLowerCase());

        stringBuilder.delete(0, 5);
        stringBuilder.replace(3, 9, "/");
        stringBuilder.replace(7, 9, "/");
        stringBuilder.replace(9, 10, "/");

        System.out.println(stringBuilder);

    }

}
