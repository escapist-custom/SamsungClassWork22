package com.samsung.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int res = N + 2 - (N % 2);
        System.out.println(res);
    }
}
