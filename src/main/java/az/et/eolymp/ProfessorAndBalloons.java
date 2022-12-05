package az.et.eolymp;

import java.util.Scanner;

public class ProfessorAndBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int blue = a + b - n;
        System.out.print(blue + " " + (b-blue) + " " + (a - blue));
    }
}
