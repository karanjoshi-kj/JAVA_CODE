import java.util.Scanner;
public class pyramid3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter the number of rows :");
    n = sc.nextInt();

    for ( ; n >= 1; n--) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
     sc.close();    
    }
}
    
}
