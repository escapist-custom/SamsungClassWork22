package com.samsung.homework_one_six;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        if (N < 10 && N >= 0) {
            System.out.println("DIGIT");
        } else if (N >= 10 && N < 100) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
