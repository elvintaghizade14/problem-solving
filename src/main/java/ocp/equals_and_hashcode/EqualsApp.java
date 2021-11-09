package ocp.equals_and_hashcode;

import java.util.Objects;

public class EqualsApp {

    class Lion {
        public final int idNumber;
        public final int age;
        public final String name;

        public Lion(int idNumber, int age, String name) {
            super();
            this.idNumber = idNumber;
            this.age = age;
            this.name = name;
        }

        /**
         *
         * @param that object
         * @return true if this object and that object are equal
         *
         * The equals() method implements an equivalence relation on non‐null object references:
         * - It is reflexive: For any non‐null reference value x, x.equals(x) should return true.
         * - It is symmetric: For any non‐null reference values x and y, x.equals(y) should return
         * true if and only if y.equals(x) returns true.
         * - It is transitive: For any non‐null reference values x, y, and z, if x.equals(y) returns
         * true and y.equals(z) returns true, then x.equals(z) should return true.
         * - It is consistent: For any non‐null reference values x and y, multiple invocations of
         * x.equals(y) consistently return true or consistently return false, provided no
         * information used in equals comparisons on the objects is modified.
         * - For any non‐null reference value x, x.equals(null) should return false.
         */
        @Override
        public boolean equals(Object that) {
            if (this == that) return true;
            if (that == null || getClass() != that.getClass()) return false;
            Lion thatLion = (Lion) that;
            return this.idNumber == thatLion.idNumber
                    && this.age == thatLion.age
                    && this.name.equals(thatLion.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(idNumber, age, name);
        }

        @Override
        public String toString() {
            return String.format("Lion{idNumber=%d, age=%d, name='%s'}", idNumber, age, name);
        }
    }


}