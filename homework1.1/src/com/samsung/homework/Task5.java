package com.samsung.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        time %= 86400;
        int hours, minutes, seconds;
        hours = time / 3600;
        minutes = time % 3600 / 60 % 10;
        seconds = time % 3600 % 60 % 10;
        System.out.println(hours + ":" + time % 3600 / 60 / 10 + minutes + ":" + time % 3600 % 60 /10 + seconds);
    }
}
