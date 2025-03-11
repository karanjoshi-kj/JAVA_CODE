//DONE BY RUN TIME INITIALIZATION....


import java.util.Scanner;
 class matrix1{
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];

    void getdata(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) 
        for (int j = 0; j < 3; j++) {
            System.out.println("enter the numbers");
            a[i][j] = sc.nextInt();
        }    
        for (int i = 0; i < 3; i++) 
        for (int j = 0; j < 3; j++) {
            System.out.println("enter the numbers");
            b[i][j] = sc.nextInt();
        }
        sc.close();    
    }
    void add(){
      for (int i = 0; i < 3; i++) 
      for (int j = 0; j < 3; j++) 
        c[i][j] = a[i][j]+b[i][j];
    }
    void putdata(){
        for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++) 
        System.out.print(c[i][j] + "    ");    
    }
        System.out.println();
        
    }
class demoadd{
    public static void main(String[]args){
        matrix1 aa = new matrix1();
        aa.getdata();
        aa.add();
        aa.putdata();
    }
}
} 
