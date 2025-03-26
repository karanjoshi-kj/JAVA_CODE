package Recusion_JAVA;

import java.util.*;

public class FactorialUsingRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // BASE CONDITION
            return 1;
        }
        return n * factorial(n - 1);     //RECUSION
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");

        int num = sc.nextInt();
        System.out.println("Factorial of the " + num + "is" + factorial(num));
        sc.close();

    }
}
