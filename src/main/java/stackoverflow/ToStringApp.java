package stackoverflow;

public class ToStringApp {
  public static void main(String[] args) {
    Boolean[] refs = new Boolean[1];
    System.out.println(refs);
    // output: [Ljava.lang.Boolean;@3764951d

    boolean[] prims = new boolean[1];
    System.out.println(prims);
    // output: [Z@4b1210ee

    int[] ints = new int[0];
    System.out.println(ints);
    // output #3: [I@4d7e1886
  }
}