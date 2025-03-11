//package pattern_java;

import java.util.Scanner;
public class pyramid1 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        n= sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
