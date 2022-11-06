package com.samsung.homework2.homework2_2_3;


public class Time {
    int hour, min;

    public Time(int time) {
        hour = (int) (time / 60);
        min = (int) (time % 60);
    }


    public String toString() {
        return hour + ":" + min;
    }
    public static void main(String[] args) {
        Time time = new Time(182);
        System.out.println(time);
    }
}