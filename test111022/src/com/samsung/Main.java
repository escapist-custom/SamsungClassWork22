package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println();

        System.out.print("jgeofg;woerij\n");
        System.out.print("jgeofg;woerij");


        double aDouble = 3.14133454236256;

        System.out.printf("3 знака : %.3f | 5 знаков : %.5f" , aDouble, aDouble);
*/
        /*int t = scanner.nextInt();
        while (t <= 10) {
            System.out.println(t);
            t++;
        }

        do {
            System.out.println(t);

        } while (t < 100);
*/
        /*int count = 0;
        int n = 0;
        while (n > -1) {
            n = scanner.nextInt();
            count++;
        }
        System.out.println(count);
        scanner.close();
        int n, count = 0;

        do {
            n = scanner.nextInt();
            count++;
        } while (n >= 0);
*/

        int n = scanner.nextInt();

        /*while (n < 100) {
            n++;
            if (n == 71) continue;

            System.out.println(n);
        }*/

        while (n < 100) {
            n += Math.random() * 100;

            System.out.println(n);

            if (n == 50) break;
        }
    }
}