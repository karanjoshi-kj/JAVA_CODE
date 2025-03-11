package ARRAY_JAVA;

import java.util.Scanner;
public class BS {
    int a [] = new int[10];  // bracket ke andar size likate h KJ sir
    int key;
    Scanner sc = new Scanner(System.in);

    void getdata(){
        for (int i = 0; i < 10; i++) {
            System.out.println("enter the numbers");
            a[i] = sc.nextInt();
        }
        System.out.println("enter number to search");
        key = sc.nextInt();
    }

    void search(){
       int i , j , mid , flag , pos = 1 ;
       i=0;
       j=9;
       flag=0;

       while (i<=j && flag == 0) {
        mid = (i+j)/2;
        if (a[mid]==key) {
            flag = 1;
            pos = mid+1;
        }
        if (a[mid]>key) {
            j = mid-1;
        }
        if (a[mid]<key) {
            i = mid+1;
        }
    }
        if (flag == 0) {
            System.out.println("the element is not found");
        }
        else{
            System.out.println("the element is found at the "+pos);
        }
       }
    
}
    class Binarysearch{
        public static void main(String[]args){
            BS bb = new BS();
            bb.getdata();
            bb.search();
        }
    }        

