package BASIC_CODES;
//;;;;;;;;;;;;an armstrong number is a number whose , sum of the indivual number is equal to the original number;;;;;;


import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        int n , z , count = 0 ;
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the number :");
        n = sc.nextInt();

       z = n;
       while (z>0) {
        count = count+1;
        z = z/10;
       }
       System.out.println("number of digits" +count);
       sc.close();
    } 
}
