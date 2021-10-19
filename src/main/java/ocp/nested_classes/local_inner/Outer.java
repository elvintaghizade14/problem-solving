package ocp.nested_classes.local_inner;

public class Outer {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        final Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        final Outer outer = new Outer();
        outer.calculate();
    }
}