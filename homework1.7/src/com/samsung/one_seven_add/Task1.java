package com.samsung.one_seven_add;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int N = 0;
        boolean con = false;
        while (count < n){
            N = scanner.nextInt();
            count++;
            if (N <= 427) {
                con = true;
                break;
            }
        }
        if (con) {
            System.out.println("Crash " + count);
        } else {
            System.out.println("No crash");
        }
    }
}
