package com.samsung.one_seven;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int min = 9;
        boolean even = true;

        while (n > 1) {
            if (n % 10 <= min && (n % 10) % 2 != 0) {
                min = n % 10;
                even = false;
            }
            n /= 10;
        }
        if (even) {
            System.out.println("NO");
        } else {
            System.out.println(min);
        }
    }
}
