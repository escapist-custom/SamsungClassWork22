package one_nine_add;

public class MyMath {
    public static void main(String[] args) {

    }
    public static int min(int x1, int x2, int x3, int x4) {
        int min = 1000000000;
        int[] numbers = {x1, x2, x3, x4};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
        }
        return min;
    }
}
