package com.samsung.cw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte aByte = 127;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 2000000000L;

        Scanner scanner = new Scanner(System.in);
        double aDouble = 1.1415;
        aDouble = scanner.nextDouble();

        float aFloat = 8.542346245F;

        // boolean aBoolean = true;
        boolean aBoolean1 = false;

        aBoolean1 = true;

        char aChar = 97;

        String string = "string";

        System.out.println(aByte);
        System.out.println(aInt);
        System.out.println(aShort);
        System.out.println(aDouble);
        System.out.println(aFloat);
        int a = 10, b = 5;
        double res;

        res = a + b;
        System.out.println(res);

        res = a - b;
        System.out.println(res);

        res = a * b;
        System.out.println(res);

        res = (double) a / b;
        System.out.println(res);

        res = a % b;
        System.out.println(res);

        int i = 0;

        i++;

        System.out.println( i++ ); // i = i + 1
        System.out.println( i );
        System.out.println( ++i );

        System.out.println(i--); // i = i - 1
        System.out.println(i);

        i += 5;
        i /= 2; // i = i / 2
        i %= 2; // i = i % 2
        i *= 2; // i = i * 2
        i -= 2; // i = i - 2

    }
}
