/*
......::PRINT THE FOLLOWING PATERRN..::.....
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;
public class pyramid13 {
    public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of rows");
    n=sc.nextInt();

    for (int i = 1; i <= n; i++) {
     
        for (int b = 1; b < i; b++) 
        System.out.print(" ");
        
        for (int j = 1; j <= 2*(n-i)+1 ; j++) 
        System.out.print("*");    
        
        
        System.out.println();
    }
    sc.close();
    }
}
