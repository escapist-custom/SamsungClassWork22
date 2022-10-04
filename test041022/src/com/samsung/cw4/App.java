package com.samsung.cw4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*

        boolean aBool = true;

        aBool = true;
        int n = scanner.nextInt();

        aBool = 0 + 5 < n * 10 && n < 10;

        boolean bBool;

        System.out.println(aBool);


        // тернарния операция
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a > b ? a : b;
        System.out.println(x);*/

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String result = (y * y + x * x > 4 && x < 2 && y < x && y > 0) ? "YES" : "NO";

        System.out.println(result);

        Math.sin(x);
    }
}
