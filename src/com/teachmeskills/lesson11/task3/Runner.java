package com.teachmeskills.lesson11.task3;

public class Runner {

    public static void main(String[] args) {

        String string = "Hello world";

        char[] chars = string.toCharArray();
        char[] doubleChar = new char[chars.length * 2];

        for (int i = 0; i < chars.length; i++) {
            for (int j = i * 2; j < doubleChar.length; j++) {
                doubleChar[j] = chars[i];
            }
        }

        System.out.println(doubleChar);

    }

}
