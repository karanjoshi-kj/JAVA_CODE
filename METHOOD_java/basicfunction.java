package METHOOD_java;

import java.util.Scanner;

public class basicfunction {
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }

    public static void main(String[] ar) {
        sum();

    }
}
