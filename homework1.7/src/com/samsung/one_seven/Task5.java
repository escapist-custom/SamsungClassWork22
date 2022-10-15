package com.samsung.one_seven;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        while (n > 0) {
            n /= 2;
            count++;
        }
        System.out.println(count);
    }
}
