package com.samsung.homework_ad_one_six;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String one = "I";
        String five = "V";
        String ten = "X";
        String fifty = "L";
        String hundred = "C";
        String res = "";

        if (x == 40) {
            res = ten + fifty;
        }
        if (x < 40) {
            if (x % 10 == 4) {
                res = ten.repeat(x / 10) + one + five;
            } else if (x % 10 == 9) {
                res = ten.repeat(x / 10) + one + ten;
            } else if (x % 10 < 4) {
                res = ten.repeat(x / 10) + one.repeat(x % 10);
            } else if (x % 10 >= 5) {
                res = ten.repeat(x / 10) + five + one.repeat(x % 10 - 5);
            }
        } else if (x >= 40 && x < 50) {
            if (x % 10 == 4) {
                res = ten + fifty + one + five;
            }
            if (x % 10 == 9) {
                res = ten + fifty + one + ten;
            } else if (x % 10 < 4) {
                res = ten + fifty + one.repeat(x % 10);
            } else if (x % 10 >= 5) {
                res = ten + fifty + five + one.repeat(x % 10 - 5);
            }

        } else {
            if (x % 10 == 4) {
                res = fifty + ten.repeat((x - 50) / 10) + one + five;
            }
            if (x % 10 == 0) {
                res = fifty + ten.repeat((x - 50) / 10);
            } else if (x % 10 == 9) {
                res = fifty + ten.repeat((x - 50) / 10) + one + ten;
            } else if (x % 10 < 4) {
                res = fifty + ten.repeat((x - 50) / 10) + one.repeat(x % 10);
            } else if (x % 10 >= 5) {
                res = fifty + ten.repeat((x - 50) / 10) + five + one.repeat(x % 10 - 5);
            }
        }

        if (x >= 90 && x < 100) {
            if (x % 10 == 0) {
                res = ten + hundred;
            } else if (x % 10 == 9) {
                res = ten + hundred + one + ten;
            } else if (x % 10 < 4) {
                res = ten + hundred + one.repeat(x % 10);
            } else if (x % 10 >= 5) {
                res = ten + hundred + five + one.repeat(x % 10 - 5);
            } else if (x % 10 == 4) {
                res = ten + hundred + one + five;
            }
        }
        if (x == 100) {
            res = hundred;
        }
        System.out.println(res);

    }
}