package com.samsung.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        boolean var = (x >= -3 && x <= 5) || (x >= 9 && x <= 15);
        System.out.println(var);
    }
}
