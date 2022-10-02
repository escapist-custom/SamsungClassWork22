package com.samsung.homework1_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int res;
        res = (number / 100) + ((number % 100) / 10) + (number % 10);
        System.out.println(res);
    }
}
