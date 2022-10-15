package com.samsung.one_seven;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;

        while (a >= b) {
            count += 1;
            a -= b;
        }
        if (a < b) {
            System.out.println(count + " " + a);
        } else {
            System.out.println(count + " " + a % count);
        }
    }
}
