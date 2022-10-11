package com.samsung.homework_ad_one_six;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= c){
            if (a >= b){
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else if (b >= c) {
            if (b >= a){
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        } else if (c >= b) {
            if (c >= a) {
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        }
    }
}
