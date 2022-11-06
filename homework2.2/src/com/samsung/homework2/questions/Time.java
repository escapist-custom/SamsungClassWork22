package com.samsung.homework2.questions;

public class Time {
    int hour, min, sec;

    public Time(int secs) {
        hour = secs / 3600;
        min = ((secs % 3600) / 60) % 10;
        sec = ((secs % 3600) % 60);
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
    public static void main(String[] args) {
        Time time = new Time(3661);
        System.out.println(time);
    }
}
