package az.et.hackerrank.problemsolving;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(8, "DDUUUUDD"));
    }

    private static int countingValleys(int n, String s) {
        int count = 0;
        int valleys = 0;
        for (int i = 0; i < n; i++) {
            count += s.charAt(i) == 'U' ? +1 : -1;
            if (count == 0 && s.charAt(i) == 'U') {
                valleys++;
            }
        }
        return valleys;
    }
}
