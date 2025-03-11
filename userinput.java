import java.util.Scanner;
public class userinput {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number ");
     int  num = sc.nextInt();
     sc.close();
     System.out.println("the number is " +num);
    }
}
