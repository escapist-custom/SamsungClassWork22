package one_nine_add;

public class Geom {
    public static void main(String[] args) {
    }
    public static double segmentLength(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return result;
    }
    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        double result1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double result2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double result3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double finish = result1 + result2 + result3;
        return finish;
    }
}
