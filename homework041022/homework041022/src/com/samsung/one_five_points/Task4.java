package com.samsung.one_five_points;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        String res = (((x <= 0 && y < -x) || (x >= 0 && y < x)) && y > x * x - 2) ? "YES" : "NO";
        System.out.println(res);
    }
}
