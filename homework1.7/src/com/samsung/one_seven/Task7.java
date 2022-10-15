package com.samsung.one_seven;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
