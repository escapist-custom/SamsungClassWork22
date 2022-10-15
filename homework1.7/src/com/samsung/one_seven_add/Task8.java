package com.samsung.one_seven_add;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double res = 1;
        int count = 0;
        boolean flag = false;

        if (n % 2 == 0) {
            n /=2;
            flag = true;
        } else {
            n -= 1;
        }
        while (count < n) {
            res *= a;
            count++;
        }
        if (flag) {
            System.out.println(res * res);
        } else {
            System.out.println(a * res);
        }
    }
}
