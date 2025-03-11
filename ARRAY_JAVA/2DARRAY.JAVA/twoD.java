//DONE BY RUN TIME INITIALIZTION.....

import java.util.Scanner;
class Matrix {
int a[][] = new int[3][3];    
    //input function
    void getdata(){
        Scanner sc = new Scanner(System.in);
        int i , j;
        for ( i = 0; i < 3; i++){
        for ( j = 0; j < 3 ; j++ ){
            System.out.println("enter the number");
            a[i][j] = sc.nextInt();
        }
    }
}
    //output function
    void putdata(){
        for (int i = 0; i < 3; i++){ 
        for (int j = 0; j < 3; j++) {
           System.out.print(a[i][j] +"    ");       
        }
        System.out.println();
    }
    }
}


public class twoD{
public static void main(String[] args){
    Matrix aa = new Matrix();
    aa.getdata();
    aa.putdata();
}
}

