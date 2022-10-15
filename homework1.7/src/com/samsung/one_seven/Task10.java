package com.samsung.one_seven;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        int count = 0;
        boolean run = true;

        System.out.println();

        while (run) {
            n++;
            num = 1;
            count = 0;
            while (num <= 20) {
                if (n % num == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
                num++;
            }
            if (count <= 2 ) {
                System.out.println(n);
                run = false;
            }
        }
    }
}
