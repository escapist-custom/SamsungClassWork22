package com.samsung.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean res = ((b == -a || b == -c || b == -d) || (a == -b || a == -c || a == -d) || (c == -b || c == -a || c == -d) || (d == -b || d == -a || d == -c));
        System.out.println(res);
    }
}
