package com.samsung.homework2.questions;

public class Fraction {
    //Variables
    static int numerator;// Числитель
    static int denominator = 1;// Знаменатель
    
    //-------------------------------------------
    // Methods
    public Fraction(int numerator1, int denominator1){
        if (denominator == 0){
                System.out.println("Denominator can't be zero. Choose another one.");
                return;
        }
        numerator = numerator1;
        denominator = denominator1;
    }

    //-------------------------------------------
    public static void multiply(Fraction b) {
        numerator *= b.numerator;
        denominator *= b.denominator;
        System.out.println("Res: " + numerator + "/" + denominator);
    }

    //-------------------------------------------
    public static void divideOn(Fraction b) {
        int pre = b.numerator;
        b.numerator = b.denominator;
        b.denominator = pre;
        numerator *= numerator;
        denominator *= b.denominator;
        System.out.println("Res: " + numerator + "/" + denominator);
    }

    //-------------------------------------------
    public static void minus(Fraction b) {
        denominator = gcd(numerator, denominator);
        numerator *= denominator / numerator;
        b.numerator *= denominator / b.numerator;
        numerator -= b.numerator;
        if (numerator == 0) numerator = 1;
        if (denominator % numerator == 0) {
            denominator /= numerator;
            numerator = denominator % numerator;
            }   
        System.out.println("Res: " + numerator + "/" + denominator);
    }

    //-------------------------------------------
    private static int gcd(int numerator, int denominator){
        while (numerator != denominator && denominator != 0) {
                if (numerator > denominator) {
                        numerator %= denominator;
                } else {
                        denominator %= numerator;
                }
        }
        return numerator + denominator;
    }

    //-------------------------------------------
    // Main method
    public static void main(String[] args) {
        Fraction a = new Fraction(2, 4);
        Fraction s = new Fraction(2, 2);
        a.divideOn(s);
    }
}