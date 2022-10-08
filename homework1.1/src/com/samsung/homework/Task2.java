package com.samsung.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum;
        number = scanner.nextInt();
        sum = number / 100 + (number / 10) % 10 + number % 10;
        System.out.println(sum);
    }
}
