package BASIC_CODES;
import java.util.Scanner;
public class area {
    public static void main(String args[]){
    int len , bre , area;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length");
    len = sc.nextInt();
    System.out.println("enter the breadth");
    bre = sc.nextInt();
    area = len*bre;
    System.out.println("area of rectangle " +area);
    sc.close();
    }
}
