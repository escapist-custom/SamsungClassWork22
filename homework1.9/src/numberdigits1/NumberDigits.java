package numberdigits1;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        String N = Integer.toString(n);
        char[] c = N.toCharArray();
        for (int i = 0; i < c.length; i++){
            sum += Integer.parseInt(String.valueOf(c[i]));
        }
        return sum;
    }
}