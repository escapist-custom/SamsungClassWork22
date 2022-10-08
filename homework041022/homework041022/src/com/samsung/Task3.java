package com.samsung;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);

            double x = scanner.nextDouble();
            boolean res;
            res = (x < -2 || x > 3) && (x < 6 || x > 9);
        System.out.println(res);
    }
}