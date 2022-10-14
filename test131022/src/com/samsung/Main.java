package com.samsung;

public class Main {
    public static void main(String[] args) {

       /* for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }*/

       /* String str = "ogjwe;lofgwpgnj";
        System.out.println(str);*/

       /* int[] array;
        array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }*/

        int[] array = new int[5];

        double res = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            res += array[i];
        }

        System.out.println("\n" + res / array.length);

    }
}