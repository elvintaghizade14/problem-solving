package az.et.job_interviews.aws2;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static void fizzBuzz(final int n) {
        for (int i = 1; i <= n; i++) {
            String result = String.valueOf(i);
            final boolean divisibleBy3 = i % 3 == 0;
            final boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) result = "FizzBuzz";
            else if (divisibleBy3) result = "Fizz";
            else if (divisibleBy5) result = "Buzz";
            System.out.println(result);
        }
    }
}