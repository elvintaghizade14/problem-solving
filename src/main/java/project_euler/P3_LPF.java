package project_euler;

public class P3_LPF {
  public static void main(String[] args) {
    long n = 600851475143L;
    boolean flag = false;
    while (!flag) {
      n--;
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % 2 == 0) break;
      }
      flag = true;
    }
    System.out.println(n);
  }
}