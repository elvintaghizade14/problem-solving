package udemy;

public class ChangeApp {
    public static void mainV1(String[] args) {
        int a = 5; // 5
        int b = 4; // 4

        System.out.println("A is: " + a); // A is: 5
        System.out.println("B is: " + b); // B is: 4

        a = a + b; // a = 5 + 4 = 9 -> a = 9
        b = a - b; // b = 9 - 4 = 5 -> b = 5
        a = a - b; // a = 9 - 5 = 4 -> a = 4

        System.out.println("A is: " + a); // A is: 4
        System.out.println("B is: " + b); // B is: 5
    }

    public static void mainV2(String[] args) {
        int a = 5; // 5
        int b = 4; // 4

        System.out.println("A is: " + a); // A is: 5
        System.out.println("B is: " + b); // B is: 4

        a = a * b; // a = 5 * 4 = 20 -> a = 20
        b = a / b; // b = 20 / 4 = 5 -> b = 5
        a = a / b; // a = 20 / 5 = 4 -> a = 4

        System.out.println("A is: " + a); // A is: 4
        System.out.println("B is: " + b); // B is: 5
    }
}
