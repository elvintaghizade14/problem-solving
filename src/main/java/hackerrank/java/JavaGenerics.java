package hackerrank.java;

public class JavaGenerics<A> {
  public void printArray(A[] array) {
    for (A a : array) {
      System.out.println(a);
    }
  }
}
