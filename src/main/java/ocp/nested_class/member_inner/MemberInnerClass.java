package ocp.nested_class.member_inner;

public class MemberInnerClass {
    private final String GREETING = "Hi";

    protected class Inner {
        public final int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++) System.out.println(GREETING);
        }
    }

    public void callInner() {
        new Inner().go();
    }

    public static void main(String[] args) {
        new MemberInnerClass().callInner();
    }
}