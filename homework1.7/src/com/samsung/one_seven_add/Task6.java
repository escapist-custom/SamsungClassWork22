package com.samsung.one_seven_add;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean res = false;

        while (n > 0) {
            if (n % 10 == (n / 10) % 10) {
                res = true;
            }
            n /= 10;
        }
        if (res) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
