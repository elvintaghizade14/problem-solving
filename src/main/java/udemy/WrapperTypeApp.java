package udemy;

public class WrapperTypeApp {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        String s3 = "abc";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        byte n1 = (byte) 252;
        Integer n2 = 252;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 == n2);
        System.out.println(n2.equals(n1));

    }
}