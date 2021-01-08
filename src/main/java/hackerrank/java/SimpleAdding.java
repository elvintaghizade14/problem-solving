package hackerrank.java;

public class SimpleAdding {
  static class Add {
    void add(int... numbers) {
      StringBuilder sb = new StringBuilder();
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
        int num = numbers[i];
        sum += num;
        sb.append(num);
        if (i != numbers.length - 1) sb.append("+");
        else sb.append("=");
      }
      sb.append(sum);
      System.out.println(sb.toString());
    }
  }

  public static void main(String[] args) {
    Add add = new Add();
    add.add(1, 2, 3, 4, 5, 6);
  }
}