package com.teachmeskills.lesson11.task2.minAndMax;

public class MinMax {

    public static void doMinMax (String string) {

        String[] arrayString = string.split(" ");
        String max = "";
        String min = "";

        int maxSize = 0;

        for (String s : arrayString) {
            if (s.length() >= maxSize) {
                maxSize = s.length();
                max = s;
            }
        }

        int minSize = maxSize;

        for (String s : arrayString) {
            if (s.length() <= minSize) {
                minSize = s.length();
                min = s;
            }
        }

        System.out.println("Min " + min);
        System.out.println("Max " + max);

    }

}
