package METHOOD_java;

public class MaxFunction {
    public static int max(int a, int b, int c){
        if (a>b && a>c) {
        return a;
        }
        else if (b>a && b>c) {
        return b;
        }
        else{
        return c;
        }
    } 
    public static void main(String[]args){
        System.out.println("the greatest number" +max(10, 20, 3));
    }
}
