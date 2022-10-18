package com.samsung.one_eight_add1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String bin = Integer.toBinaryString(n);
        for (int i = bin.length() - 1; i >= 0; i--) {
            System.out.print(bin.charAt(i));
        }
    }
}