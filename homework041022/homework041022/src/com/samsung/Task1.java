package com.samsung;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        boolean var = x >= 3 && x <= 8;
        System.out.println(var);
    }
}