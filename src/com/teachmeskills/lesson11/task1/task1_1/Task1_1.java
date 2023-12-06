package com.teachmeskills.lesson11.task1.task1_1;

public class Task1_1 {

    public static void doPrintTwoBlock (String documentNumber) {

        String[] string = documentNumber.split("-");

        System.out.println(string[0] + " " + string[1]);

    }

}
