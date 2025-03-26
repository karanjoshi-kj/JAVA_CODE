package METHOOD_java;

import java.util.*;
public class OddEvenarr {
    static void transformarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                arr[i] = arr[i]*arr[i];
            }
            else{
                arr[i] = arr[i]*arr[i]*arr[i];
            }
        }
    }

    public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("enter the elements");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    transformarray(arr);

    System.out.println("tramsformed array is");
    for (int num : arr) {
    System.out.println(num+ " ");        
    }
    sc.close();
    }
}
