package com.samsung.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean res = number > 0 && number % 5 == 0 && number / 100 <= 9 && number / 100 != 0;
        System.out.println(res);
    }
}
