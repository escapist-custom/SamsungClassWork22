package com.samsung.homework_ad_one_six;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println("acute");
        } else {
            if (a + b > c && b + c > a && c + a > b) {
                if (a >= c) {
                    if (a >= b) {
                        if (b * b + c * c == a * a) {
                            System.out.println("right");
                        } else if (b * b + c * c > a * a) {
                            System.out.println("acute");
                        } else if (b * b + c * c < a * a) {
                            System.out.println("obtuse");
                        }
                    }
                }
                if (b >= c) {
                    if (b >= a) {
                        if (a * a + c * c == b * b) {
                            System.out.println("right");
                        } else if (a * a + c * c > b * b) {
                            System.out.println("acute");
                        } else if (a * a + c * c < b * b) {
                            System.out.println("obtuse");
                        }
                    }
                }
                if (c >= b) {
                    if (c >= a) {
                        if (b * b + a * a == c * c) {
                            System.out.println("right");
                        } else if (b * b + a * a > c * c) {
                            System.out.println("acute");
                        } else if (b * b + a * a < c * c) {
                            System.out.println("obtuse");
                        }
                    }
                }
            } else {
                System.out.println("impossible");
            }
        }
    }
}

