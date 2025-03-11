import java.util.Scanner;
public class Per {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int num = sc.nextInt();
    sc.close();
    System.out.println("the numbver is " +num);
    if (num%2==0) 
    System.out.println("number is even ");
    else{
        System.out.println("number is odd ");
    }    
}
}
