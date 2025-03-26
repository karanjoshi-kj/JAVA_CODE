// THIS IS DONE BY BY RECURSIVE METHOD

package METHOOD_java;

public class Febonnaci {
    public static int Fibonnaci(int n){
      if (n<=1) {   // FROM HERE I WILL GET THE FIRST TWO NUMBERS OF FIBONACCI SERIES
        return n;
      }
      return Fibonnaci(n-1)+Fibonnaci(n-2);
    }
    public static void main(String[]args){
        int k = 10;   //these are number of terms
        for (int i = 0; i < k; i++) {
            System.out.println(Fibonnaci(i) +"");
        }
    }
}
