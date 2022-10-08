package com.samsung;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean res = ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 0 && c % 2 == 0) || (b % 2 == 0 && c % 2 == 0));
        System.out.println(res);

    }
}
