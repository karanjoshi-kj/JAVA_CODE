package Recusion_JAVA;

import java.util.*;
public class FibonacciSeries {
    public static int fibonacci(int n){
        if (n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);   //RECURSIVE CALL
    } 
    public static void main(String[]ar){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF TERMS");
    
    int num = sc.nextInt();
    System.out.println("FIBONACCI SERIES");

    for (int i = 0; i < num; i++) {
        System.out.println(fibonacci(i) +" ");
    }
    sc.close();
    }
}
