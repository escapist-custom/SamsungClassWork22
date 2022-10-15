package com.samsung.one_seven_add;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int count = 0;
        if (a > 0 && b > 0) {
            if (a > b) {
                while (count < b) {
                    sum += a;
                    count++;
                }
            } else {
                while (count < a) {
                    sum += b;
                    count++;
                }
            }
            System.out.println(sum);

        } else {
            if (a > b) {
                while (count < -b) {
                    sum += a;
                    count++;
                }
            }else {
                while (count < -a) {
                    sum += b;
                    count++;
                }
            }
            System.out.println(-sum);
        }

    }
}
