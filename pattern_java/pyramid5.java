import java.util.Scanner;
public class pyramid5 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n , k = 1;
    System.out.println("enter the number of rows :");
    n = sc.nextInt();

    for ( ; n >= 1; n--) {
        for (int i = 1; i <= n; i++) {
            System.out.print(k);
        }
        k = k+1;
        System.out.println();
     sc.close();    
    }
}
    
}
