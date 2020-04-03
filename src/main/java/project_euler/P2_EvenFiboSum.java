package project_euler;

public class P2_EvenFiboSum {
  public static void main(String[] args) {
    int sum = 0;
    int num0 = 1;
    int num1 = 1;
    int n = 1;
    while (n < 4000000) {
      n = num0 + num1;
      num0 = num1;
      num1 = n;
      if (n % 2 == 0) sum += n;
    }
    System.out.println(sum);
  }
}
