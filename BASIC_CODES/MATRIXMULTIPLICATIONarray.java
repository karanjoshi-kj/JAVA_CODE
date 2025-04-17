package BASIC_CODES;
import java.util.Scanner;
public class MATRIXMULTIPLICATIONarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the rows and columns of the first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("enter the rows and columns of second matrix ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("matrix multiplication is not possible");
        }

        int [][]mat1 = new int[r1][c1];
        int [][]mat2 = new int[r2][c2];
        int [][]result = new int[r1][c2];
        System.out.println("enter elements of the first matrix");
        for (int i = 0; i < r1; i++) 
            for (int j = 0; j < c1; j++) 
        mat1[i][j] = sc.nextInt();
        
        System.out.println("enter the elements of the second matrix");
        for(int i = 0; i < r2; i++)
        for (int j = 0; j < c2; j++) 
        mat2[i][j] = sc.nextInt();
            
//MATRIX MULTIPLICATION 
for (int i = 0; i < r1; i++) {
    for (int j = 0; j < r2; j++) {
        for (int k = 0; k < c1; k++) {
            result[i][j] += mat1[i][k] * mat2[k][j];
        }
    }
}        
        // ab loop lagega matrix ko display karne ke liye
        System.out.println("the resultant matrix is");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] +" ");

            }
System.out.println();
        }
sc.close();
    }
}
