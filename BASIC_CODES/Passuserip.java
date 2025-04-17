package BASIC_CODES;
import java.util.Scanner;
public class Passuserip {
    public static void main(String args[]){
    Scanner KJ = new Scanner(System.in);
    System.out.println("enter the percentage");
    int percentage = KJ.nextInt();
    System.out.println("print the percentage" +percentage   );
    KJ.close();

    if (percentage >= 90) 
    System.out.println("grade A :");
    else if (80 <= percentage && percentage < 90) {
        System.out.println("grade B");
    }
    else if (70 <= percentage && percentage < 80) {
        System.out.println("grade C");
    }
        else{
            System.out.println(" fail ");
        }

    }
}
