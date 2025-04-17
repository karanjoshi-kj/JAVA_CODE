package BASIC_CODES;
import java.util.Scanner;
public class evenodduserip {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    sc.close();
    System.out.println("enter a number ");
    int num = sc.nextInt();
    if (num%2==0) {
        System.out.println("the number is even ");
    }
    else{
        System.out.println("the number is odd ");
    }
    }
}
