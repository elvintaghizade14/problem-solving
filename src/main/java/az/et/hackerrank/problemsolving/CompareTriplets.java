package az.et.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointA = 0;
        int pointB = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                pointA++;
            } else if (a.get(i) < b.get(i)) {
                pointB++;
            }
        }
        return Arrays.asList(pointA, pointB);
    }

}
