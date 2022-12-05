package az.et.ocp.equals_and_hashcode;

public class HashCodeApp {

    class Card {
        public final String rank;
        public final String suit;

        public Card(String r, String s) {
            if (r == null || s == null)
                throw new IllegalArgumentException();
            rank = r;
            suit = s;
        }

        @Override
        public boolean equals(Object that) {
            if (!(that instanceof Card)) return false;
            Card c = (Card) that;
            return rank.equals(c.rank) &&
                    suit.equals(c.suit);
        }

        /**
         *
         * @return a number
         *
         *  - Within the same program, the result of hashCode() must not change. This means that
         *    you shouldn’t include variables that change in figuring out the hash code.
         *  - If equals() returns true when called with two objects, calling hashCode() on each of
         *    those objects must return the same result. This means hashCode() can use a subset of
         *    the variables that equals() uses.
         *  - If equals() returns false when called with two objects, calling hashCode() on each of
         *    those objects does not have to return a different result. This means hashCode() results
         *    do not need to be unique when called on unequal objects.
         */
        @Override
        public int hashCode() {
            return rank.hashCode();
        }
    }


}