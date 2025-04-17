package BASIC_CODES;
import java.util.Scanner;
public class TRANSPOSEUSERarray {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int rows = sc.nextInt();
int cols = sc.nextInt();

int[][] matrix = new int[rows][cols];
int[][] transpose = new int[cols][rows];

//PRINT MATRIX
System.out.println("enter the matrix:");
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
    }
}

// transpose matrix
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        transpose[j][i] = matrix[i][j];
    }
}

//PRINT TRANSPOSE
System.out.println("TRANSPOSE MATRIX");
for (int i = 0; i < cols; i++) {
    for (int j = 0; j < transpose.length; j++) {
        System.out.print(transpose[i][j]+ "");
    }
    System.out.println();
}
sc.close();
}
}
