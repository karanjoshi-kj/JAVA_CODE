package BASIC_CODES;
import java.util.Scanner;
public class factorial {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,fac=1;
System.out.println("enter the number");
n = sc.nextInt();

while (n>0) {
    fac = fac*n;
    n--;
}
System.out.println("the factorial of the number is" +fac);
sc.close();
}
    
}
