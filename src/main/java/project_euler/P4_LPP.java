package project_euler;

public class P4_LPP {
  public static void main(String[] args) {
    throw new IllegalArgumentException("Wrong implementation...");
//    int count = 0;
//    for (int i = 999; i > 99; i--) {
//      for (int j = 999; j > 99; j--) {
//        int prod = i * (j - 1);
//        if (isPalindrome(prod)) {
//          System.out.println(prod);
//          break;
//        }
//      }
//    }
  }

  private static boolean isPalindrome(int prod) {
    String num = String.valueOf(prod);
    return num.contentEquals(new StringBuilder(num).reverse());
  }
}
