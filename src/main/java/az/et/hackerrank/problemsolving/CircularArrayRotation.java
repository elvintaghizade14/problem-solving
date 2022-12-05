package az.et.hackerrank.problemsolving;

import java.util.Arrays;

public class CircularArrayRotation {
    public static void main(String[] args) {
        System.out.println(circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{1}));
        System.out.println(circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{1, 2}));
        System.out.println(circularArrayRotation(new int[]{3, 4, 5}, 0, new int[]{0, 1, 2}));
        System.out.println(circularArrayRotation(new int[]{3, 4, 5}, 1, new int[]{0, 1, 2}));
        System.out.println(circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{0, 1, 2}));
        System.out.println(circularArrayRotation(new int[]{3, 4, 5}, 3, new int[]{0, 1, 2}));
        System.out.println(circularArrayRotation1(new int[]{3, 4, 5}, 3, new int[]{0, 1, 2}));
    }

    private static int[] circularArrayRotation1(int[] a, int k, int[] queries) {
        int len = a.length;
        int resLen = queries.length;
        int[] res = new int[resLen];
        k %= len;
        for (int i = 0; i < resLen; i++) {
            res[i] = a[(len - k + queries[i]) % len];
        }
        return res;
    }

    private static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        final int len = a.length;
        final int k1 = len - k % len;
        return Arrays.stream(queries)
                .map(i -> a[(k1 + i) % len])
                .toArray();
    }
}
