package com.samsung.one_eight_add2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -2147483648 ;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num >= max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
