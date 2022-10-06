package com.samsung.cw5;

import java.util.Scanner;

public class Main {
    static int d = 19;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int nextInt = scanner.nextInt();

        /*if (nextInt > 5) {
            System.out.println("nextInt > 5");
        } else {
            System.out.println("nextInt < 5");
        }*/

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println( a );
            } else {
                System.out.println( c );
            }
        } else {
            if (b > c) {
                System.out.println( b );
            }
            else {
                System.out.println( c );
            }
        }*/

        int n = scanner.nextInt();

        /*switch (n){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("We don't have this month!");
        }
*/

        int a = 1;
        int b = 10;
        if (a > 0){
            int c = 5;
            int d = 100;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else {
            System.out.println(a);
            System.out.println(b);
        }
    }
}