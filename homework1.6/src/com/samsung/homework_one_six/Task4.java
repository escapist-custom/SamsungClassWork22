package com.samsung.homework_one_six;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.0");
        String res = "";

        if ((a == 0 && b < 0) || (a < 0 && b < 0) || (a == 0 && b == 0)){
            res = "no such x";
        } else if (a < 0 && b > 0){
            res = df.format((b / a)) + "<" + "x" + "<" + df.format((b / -a));
        } else if (a > 0 && b < 0) {
            res = "x<" + df.format((b / a)) + " or " + "x>" + df.format((b / -a));
        } else if (a >=0 && b > 0) {
            res = "any x";
        }
        System.out.println(res);
    }
}