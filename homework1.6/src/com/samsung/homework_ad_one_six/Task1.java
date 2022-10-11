package com.samsung.homework_ad_one_six;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12){
            System.out.println(31);
        } else if (a == 4 || a == 6 || a == 9 || a == 11){
            System.out.println(30);
        } else if (a == 2){
            System.out.println(28);
        } else {
            System.out.println(0);
        }

    }
}
