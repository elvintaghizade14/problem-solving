package az.et.hackerrank.problemsolving;

public class KangarooApp {
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(21, 6, 47, 3));
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(43, 2, 70, 2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int deltaV = v2 - v1;
        if (deltaV == 0) {
            return "NO";
        }
        int deltaX = x1 - x2;
        return (deltaX / deltaV) > 0 && Math.abs(deltaX) % Math.abs(deltaV) == 0 ? "YES" : "NO";
    }
}
