//Infinite Loop Finally block with no deadlock.....::. 


package JAVA_EXCEPTION_HANDLING;

public class InfiniteLoopFinally {
    public static void main(String[] args) {
        try{
            System.out.println("INSIDE TRY BLOCK");

            int a = 5/0;
        }
        catch(ArithmeticException e){
            System.out.println("CAUGHT EXCEPTION");
        }

        finally{
            System.out.println("INSIDE FINALLY BLOCK");

            while (true);
        }
    }
}
