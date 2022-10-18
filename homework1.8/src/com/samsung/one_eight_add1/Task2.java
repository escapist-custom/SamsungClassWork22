package com.samsung.one_eight_add1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int am = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < am - 1; i++) {
            int num = scanner.nextInt();
            sum1 += num;
        }
        for (int i = 1; i <= am; i++) {
            sum2 += i;
        }
        System.out.println(sum2 - sum1);
    }
}
