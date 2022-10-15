package com.samsung.one_seven_add;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 10000;
        boolean flag = false;

        while (count <= 99999) {
            count++;
            if (count % a == b && count % c == d) {
                System.out.print(count + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
