package az.et.ocp.nested_class.local_inner;

public class OuterClass {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class InnerClass {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        final InnerClass innerClass = new InnerClass();
        innerClass.multiply();
    }

    public static void main(String[] args) {
        final OuterClass outerClass = new OuterClass();
        outerClass.calculate();
    }
}