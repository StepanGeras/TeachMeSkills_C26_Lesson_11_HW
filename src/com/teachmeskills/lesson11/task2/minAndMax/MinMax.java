package com.teachmeskills.lesson11.task2.minAndMax;

public class MinMax {

    public static void doMinMax (String string) {

        String[] arrayString = string.split(" ");
        String max = new String();
        String min = new String();

        int maxSize = 0;

        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].length() >= maxSize) {
                maxSize = arrayString[i].length();
                max = arrayString[i];
            }
        }

        int minSize = maxSize;

        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].length() <= minSize){
                minSize = arrayString[i].length();
                min = arrayString[i];
            }
        }

        System.out.println("Min " + min);
        System.out.println("Max " + max);

    }

}
