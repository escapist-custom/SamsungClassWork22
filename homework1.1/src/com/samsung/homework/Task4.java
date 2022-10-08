package com.samsung.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, n;
        a = scanner.nextInt();
        b = scanner.nextInt();
        n = scanner.nextInt();
        b *= n;
        a *= n;
        a += b / 100;
        b %= 100;
        System.out.println(a + " " + b);
    }
}
