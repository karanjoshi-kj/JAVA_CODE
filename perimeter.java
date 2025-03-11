import java.util.Scanner;
public class perimeter {
    public static void main(String args[]){
    int len ,bre , perimeter;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length");
    len = sc.nextInt();
    System.out.println("enter the breadth");
    bre = sc.nextInt();
    sc.close();
    perimeter = 2*(len+bre);
    System.out.println("the perimeter of the rectangle is " +perimeter);
    }
}
