import java.util.Scanner;
public class pyramid8 {
    public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows");
    n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        for (int s = 1; s <= n-i; s++) 
        System.out.print(" ");

      for (int j = 1; j <= i; j++) 
        System.out.print(j);



        System.out.println();
       sc.close();
    }
    }
}
