package com.samsung.one_eight;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        int c = 0;
        while (true) {
            c = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= 0 && array[i + 1] < 0) {
                    int pa = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = pa;
                    c++;
                }
            }
            if (c == 0) break;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
