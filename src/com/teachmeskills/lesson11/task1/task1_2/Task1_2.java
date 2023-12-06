package com.teachmeskills.lesson11.task1.task1_2;


public class Task1_2 {

    public static void doReplace (String documentNumber) {

        StringBuilder stringBuilder = new StringBuilder(documentNumber);
        stringBuilder.replace(5, 8, "***");
        stringBuilder.replace(14, 17, "***");

        System.out.println(stringBuilder);

    }

}
