package com.samsung.homework_ad_one_six;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        if (month == 1 && day <= 31) {
            System.out.println(365 - day);
        } else if (month == 2 && day <= 28) {
            System.out.println(365 - (31 + day));
        } else if (month == 3 && day <= 31) {
            System.out.println(365 - (59 + day));
        } else if (month == 4 && day <= 30) {
            System.out.println(365 - (90 + day));
        } else if (month == 5 && day <= 31) {
            System.out.println(365 - (120 + day));
        } else if (month == 6 && day <= 30) {
            System.out.println(365 - (151 + day));
        } else if (month == 7 && day <= 31) {
            System.out.println(365 - (181 + day));
        } else if (month == 8 && day <= 31) {
            System.out.println(365 - (212 + day));
        } else if (month == 9 && day <= 30) {
            System.out.println(365 - (243 + day));
        } else if (month == 10 && day <= 31) {
            System.out.println(365 - (273 + day));
        } else if (month == 11 && day <= 30) {
            System.out.println(365 - (304 + day));
        }else if (month == 12 && day <= 31) {
            System.out.println(365 - (334 + day));
        } else {
            System.out.println(-1);
        }
    }
}
