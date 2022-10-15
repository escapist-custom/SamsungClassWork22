package com.samsung.one_seven_add;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 2;
        int count2 = 0;

        while (count2 != n) {
            if (count % 2 == 0) {
                System.out.print(count + " ");
                count2++;
            }
            count++;

        }
    }
}
