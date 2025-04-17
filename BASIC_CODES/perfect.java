package BASIC_CODES;
// PERFECT NUMBER ==>> 6 = 1,2,3 ==>>  1+2+3 = 6  this is an eample of perfect number

import java.util.Scanner;
public class perfect {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number");
    int num = sc.nextInt();

    int sum = 0;
    for (int i = 1; i < num; i++) {
        if (num%i==0) {
            sum+=i;
        }
    }
    if (sum == num) {
        System.out.println("the number is a PERFECT NUMBER");
    }
    else{
        System.out.println("the number is not a PERFECT NUMBER");
    }
    sc.close();
    }
}
