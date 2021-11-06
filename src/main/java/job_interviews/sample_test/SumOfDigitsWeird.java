package job_interviews.sample_test;

public class SumOfDigitsWeird {
    public static void main(String[] args) {
        final int countOfDigits = new SumOfDigitsWeird().countOfDigitsWeird(12342);
        System.out.printf("Count of digits is: %d%n", countOfDigits);
    }

    private int countOfDigitsWeird(final int origin) {
        int num = origin;
        int sum = 0;
        int countOfDigits = 0;

        while (num > 0) {
            sum += num % 10;
            countOfDigits++;
            num /= 10;
        }
        sum -= origin % 10;

        System.out.printf("Number is: %d%n", origin);
        System.out.printf("Sum of digits (last not included): %d\n", sum);
        System.out.printf("Power of sum to count of digits: %.2f\n", Math.pow(sum, countOfDigits));
        return countOfDigits;
    }
}