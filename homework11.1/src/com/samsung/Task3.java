package com.samsung;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = false;
        int[][] numbers = new int[number][number];

        //---------------------------------------

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                int num = scanner.nextInt();
                numbers[i][j] = num;
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (numbers[i][j] == numbers[j][i]) {
                    continue;
                } else {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
