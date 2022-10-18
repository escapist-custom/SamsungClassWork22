package com.samsung.one_eight;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int array[] = new int[n];
        int count = 0;
        for (int i = 4; count < n; i = i + 3) {
            array[count] = i;
            count++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
