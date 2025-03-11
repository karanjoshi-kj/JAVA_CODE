import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("entered number is ");
        
        int originalnum = num;
        int reversednum = 0;

        while (num>0) {
            int digit = num%10;
            reversednum = reversednum*10+digit;
            num/=10;
        }
        if (originalnum == reversednum) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
