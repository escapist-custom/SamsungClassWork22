package com.samsung;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int number2 = sc.nextInt();
            arrayList.add(number2);
        }
        System.out.println(Collections.max(arrayList));
    }
}