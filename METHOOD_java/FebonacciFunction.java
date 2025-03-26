package METHOOD_java;

public class FebonacciFunction {
    public static void Fibonnaciseries(int terms){
        int a = 0 , b = 1;
        for (int i = 0; i < terms; i++) {
            System.out.println(a +"");
        }
        int sum = a+b;
        a = b;
        b = sum;
    }
    public static void main(String[] ar){
        int terms = 10;
        Fibonnaciseries(terms);
    }
}

