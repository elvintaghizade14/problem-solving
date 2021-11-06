package job_interviews.sample_test;

public class SumOfDigitsImproved {
    static class Data {
        public final int sumOfDigits;
        public final double expOfSumToCount;
        public final int countOfDigits;

        Data(int sumOfDigits, double expOfSumToCount, int countOfDigits) {
            this.sumOfDigits = sumOfDigits;
            this.expOfSumToCount = expOfSumToCount;
            this.countOfDigits = countOfDigits;
        }

        @Override
        public String toString() {
            return String.format(
                    "Data{sumOfDigits=%d, expOfSumToCount=%.2f, countOfDigits=%d}",
                    sumOfDigits, expOfSumToCount, countOfDigits
            );
        }
    }

    public static void main(String[] args) {
        System.out.println(
                new SumOfDigitsImproved().countOfDigits(0)
        );
        System.out.println(
                new SumOfDigitsImproved().countOfDigits(12342)
        );

    }

    private Data countOfDigits(final int origin) {
        int num = origin;
        int sumOfDigits = 0;
        int countOfDigits = 0;

        while (num > 0) {
            sumOfDigits += num % 10;
            countOfDigits++;
            num /= 10;
        }
        sumOfDigits -= origin % 10;
        final double exp = Math.pow(sumOfDigits, countOfDigits);

        return new Data(
                sumOfDigits,
                exp,
                countOfDigits
        );
    }
}