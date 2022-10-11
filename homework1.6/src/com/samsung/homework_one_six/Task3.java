package com.samsung.homework_one_six;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 10 == 1 && n % 100 != 11){
            System.out.println(n + " TORT");
        } else if ((n % 10 == 2 || n % 10 == 3 || n % 10 == 4) && (n % 100 != 12 && n % 100 != 13 && n % 100 != 14)) {
            System.out.println(n + " TORTA");
        } else {
            System.out.println(n + " TORTOV");
        }
    }
}
