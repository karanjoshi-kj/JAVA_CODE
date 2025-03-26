package METHOOD_java;

import java.util.*;

public class factorialUsingMethod {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");

        int num = sc.nextInt(); // READS THE ENTERED NUMBER AND STORES IT IN (num)
        sc.close();

        int result = factorial(num);

        System.out.println("FACTORIAL OF THE NUMBER " + num + "is" + result);
    }
}