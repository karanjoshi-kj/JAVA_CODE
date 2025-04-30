/*
 * STACKTRACE METHOD PRINTS ALL
 * EXCEPTION NAME
 * DESCRIPTION
 * STACK TRACE
 */


package EXCEPTION_HANDLING;

public class StackTraceMethod {
    public static void main(String[] args) {
        try {
            int a = 10 , b = 0 ;
            int result1 = a/b;
        }
        
        catch (Exception e) {
              System.out.println("EXCEPTIOIN CAUGHT");
              
              e.printStackTrace();
        }
    }
}
