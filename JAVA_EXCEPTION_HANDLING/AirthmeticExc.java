package JAVA_EXCEPTION_HANDLING;

public class AirthmeticExc {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int e = 5;
        System.out.println("OUTPUT"+e);  //THIS WILL PRINT 
        int c = a / b ;
        System.out.println("CHECK" +e);   // IT WILL NOT PRINT THE VALUE OF e BCOZZ IT WILL CRASH DUE TO EXCEPTION OCCURED IN LINE NUMBER 8.

        System.out.println("RESULT" +c);
    }
}
