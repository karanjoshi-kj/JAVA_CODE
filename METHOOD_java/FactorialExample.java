package METHOOD_java;

import java.util.*;

public class FactorialExample {
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int number = sc.nextInt();

        int result = factorial(number);
        System.out.println("FACTORIAL OF " + number + "is" + result);
        sc.close();
    }
}
