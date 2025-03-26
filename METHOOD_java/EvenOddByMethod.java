package METHOOD_java;

public class EvenOddByMethod {
    public static void CheckEvenOdd(int num){
        if (num%2==0) {
            System.out.println("the number is even" +num);
        }
        else{
            System.out.println("the number is odd");
        }
    }
    public static void main(String[] args){
        CheckEvenOdd(7);
    }
}
