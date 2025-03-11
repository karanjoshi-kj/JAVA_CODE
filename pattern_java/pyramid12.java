/*
 .........PRINT THE FOLLOOWING PATEERN:.....
*****
 ****
  ***
   **
    *
    */

import java.util.*;
public class pyramid12 {
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int b = 1; b < i; b++) 
        System.out.print(" ");                
        
        for (int j = 1; j <= n+1-i; j++) 
        System.out.print("*");
        
        
        System.out.println();
    }
    sc.close();
    }
}
