package com.samsung.one_seven;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int count = 25;

        while (count <= n) {
            if (count % 2 == 0) {
                sum += count;
            }
            count++;
        }
        System.out.println(sum);
    }
}
