import java.util.Scanner;
public class Series {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the denominator value ");
    int n = sc.nextInt();
    int sum = 0;

    for (int i=1; i <= n; i++) {
        sum += 1/i;
    }
    System.out.println("sum of the series is:" +sum);
    sc.close();
    }
    
}
