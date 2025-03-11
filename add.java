import java.util.Scanner;
public class add {
    public static void main(String args[]){
    int a, b , c;
    Scanner sc = new Scanner (System.in);
    sc.close();
    System.out.println("enter the first number");
    a = sc.nextInt();
    System.out.println("enter the second number");
    b = sc.nextInt();
    c = a+b;
    System.out.println("addition = "+c);
    }
}
