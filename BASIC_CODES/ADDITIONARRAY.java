package BASIC_CODES;
import java.util.Scanner;
public class ADDITIONARRAY
 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the rows of the first matrix");
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int [][] mat1 = new int[rows][cols];
    int [][] mat2 = new int[rows][cols];
    int [][] sum = new int[rows][cols];
    
    System.out.println("enter the elements of the first matrix");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            mat1[i][j] = sc.nextInt();
        }
    }
    System.out.println("enter the elements of the second matrix");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            mat2[i][j] = sc.nextInt();
        }
    }
    //ADDING MATRIX
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            sum[i][j] = mat1[i][j]+mat2[i][j];
        }
    }
    System.out.println("the sum of the matix is");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(sum[i][j] +" ");
        }
        System.out.println();
    }
    sc.close();
    }
}
