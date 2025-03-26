package Recusion_JAVA;

import java.util.*;
public class SumOfNatural {
        static int findsum(int n){
            if (n==0) {
                return 0;
            }
            return n + findsum(n-1);    //RECURSION
        }
        public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int num = sc.nextInt();
        System.out.println("sum of the natural number up to" +num+ "is:" +findsum(num));

        sc.close();
        }
}
