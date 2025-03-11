public class pyramid11 {
    public static void main(String args[]){
        int n = 5;    //number of rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) { 
                System.out.print(" "); 
               }   //print the spaces
                for (int j = 0; j < 2*i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

