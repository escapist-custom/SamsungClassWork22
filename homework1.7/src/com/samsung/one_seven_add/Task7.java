package com.samsung.one_seven_add;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;
        int count = 0;

        while (num <= n) {
            if (n % num == 0) {
                count++;
            }
            num++;
        }
        if (count > 2) {
            System.out.println("composite");
        } else {
            System.out.println("prime");
        }
    }
}
