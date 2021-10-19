package ocp.nested_classes;

public class SameVarInnerClass {
    private final int x = 10;

    class B {
        private final int x = 20;

        class C {
            private final int x = 30;

            public void allTheX() {
                System.out.println(x); // 30
                System.out.println(this.x); // 30
                System.out.println(B.this.x); // 20
                System.out.println(SameVarInnerClass.this.x); // 10
            }
        }
    }

    public static void main(String[] args) {
        SameVarInnerClass classA = new SameVarInnerClass();
        SameVarInnerClass.B classB = classA.new B();
        SameVarInnerClass.B.C classC = classB.new C();
        classC.allTheX();
    }
}