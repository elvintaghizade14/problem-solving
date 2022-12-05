package az.et.hackerrank.problemsolving;

import java.time.LocalDate;

public class LibraryFine {
    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
        System.out.println(libraryFine(9, 6, 2015, 9, 6, 2015));
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));
        System.out.println(libraryFine(2, 5, 2015, 30, 5, 2015));

    }

    private static int libraryFine1(int d1, int m1, int y1, int d2, int m2, int y2) {
        // actual:   d1, m1, y1
        // expected: d2, m2, y2
        if ((y1 < y2)
                || ((y1 == y2) && (m1 < m2))
                || ((y1 == y2) && (m1 == m2) && (d1 < d2))) return 0;
        else if (y1 > y2) return 10_000;
        else if (m1 > m2) return 500 * (m1 - m2);
        else return 15 * (d1 - d2);
    }

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // actual:   d1, m1, y1
        // expected: d2, m2, y2
        LocalDate actual = LocalDate.of(y1, m1, d1);
        LocalDate expected = LocalDate.of(y2, m2, d2);
        if (actual.isBefore(expected) || actual.isEqual(expected)) return 0;
        else if (y1 > y2) return 10_000;
        else if (m1 > m2) return 500 * (m1 - m2);
        else return 15 * (d1 - d2);
    }
}
