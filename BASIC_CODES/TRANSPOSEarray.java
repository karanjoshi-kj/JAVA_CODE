package BASIC_CODES;
public class TRANSPOSEarray {
    public static void main(String[] args){
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int rows = 3;
        int cols = 3;
        int[][] transpose = new int[cols][rows];

//TRANSPOSE MATRIX
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

// PRINT TRANSPOSE MATRIX
    System.out.println("TRANSPOSE MATRIX:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(transpose[i][j]+ " ");
        }
        System.out.println();
    }

    }
}
