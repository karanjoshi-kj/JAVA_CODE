package ARRAY_JAVA;

import java.util.Scanner;
public class Multiplyuser {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int size,product = 1;
    System.out.println("enter the size");
    size = sc.nextInt();
    int a[] = new int[size];

    for (int i = 0; i < size; i++) {
        System.out.println("enter the numbers");
        a[i] = sc.nextInt(); 
    }

    for (int i = 0; i < size; i++) {
        product = product*a[i];

        System.out.println("the product is" +product);
    }
sc.close();
    }
}
