package com.samsung.homework_one_six;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = 0;

        if (a < b && a < c && b < c){
            System.out.println(a + " " + b + " " + c);
        }
        if (b < a && b < c && a < c) {
            System.out.println(b + " " + a + " " + c);
        }
        if (c < a && c < b && a > b){
            System.out.println(c + " " + b + " " + a);
        }
        if (a < c && a < b && c < b){
            System.out.println(a + " " + c + " " + b);
        }
        if (b < a && b < c && c < a){
            System.out.println(b + " " + c + " " + a);
        }
        if (c < a && c < b && a < b){
            System.out.println(c + " " + a + " " + b);
        }

    }
}