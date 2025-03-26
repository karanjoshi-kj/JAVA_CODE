package METHOOD_java;

import java.util.Scanner;
public class MethosInArray {
    int[] initializeArray(int size){
     Scanner sc1 = new Scanner(System.in);
     int[] arr = new int[size];   //CREATE AN ARRAY OF THE GIVEN ARRAY SIZE

     System.out.println("enter" +size+ "elements");
     for (int i = 0; i < size; i++) {
        arr[i] = sc1.nextInt();
     }
     sc1.close();
     return arr;
    }
    public static void main(String[]ar){
        Scanner sc = new Scanner(System.in);
        MethosInArray obj = new MethosInArray();
       System.out.print("enter the size of the array");

       int[] newarray = obj.initializeArray(sc.nextInt()); 
       System.out.println("initialized array");
       for (int num : newarray) {
        System.out.print(num +"  ");
       }
       sc.close();
    }
}
