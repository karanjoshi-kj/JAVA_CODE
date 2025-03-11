package ARRAY_JAVA;

import java.util.Scanner;
public class arraysumuser {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int size,sum=0;
    System.out.println("enter the user size");
    size = sc.nextInt();
    
     int a [] = new int[size];
     for (int i = 0; i < size; i++) {
        System.out.println("enter the number");
        a[i] = sc.nextInt();    // IS LOOP MAI USER SAII NUMBERS MANG RAHE H ARRAY M STORE KARNE LIYE
     }
     for (int i = 0; i < size; i++)
     sum+=a[i];   // SUM FIND OUT KARNE KE LIYE:
        
     System.out.println("the sum of the array elements is" +sum);

sc.close();
    }
}