package com.teachmeskills.lesson11.task1.task1_4;

public class Task1_4 {

    public static void doUpperCase (String documentNumber) {

        StringBuilder stringBuilder = new StringBuilder(documentNumber.toUpperCase());

        stringBuilder.delete(0, 5);
        stringBuilder.replace(3, 9, "/");
        stringBuilder.replace(7, 9, "/");
        stringBuilder.replace(9, 10, "/");

        System.out.println("Letters: " + stringBuilder);

    }

}
