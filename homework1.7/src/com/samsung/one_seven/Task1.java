package com.samsung.one_seven;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = 0;

        while (n >= 0) {
            n = scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
}
