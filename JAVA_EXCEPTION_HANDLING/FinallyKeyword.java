package JAVA_EXCEPTION_HANDLING;

public class FinallyKeyword {
    public static void main(String[] args) {
        try {
            int result = 10 / 0 ;
            System.out.println("RESULT" +result);
        } 
        
        catch (ArithmeticException e) {
              System.out.println("CAUGHT EXCEPTION" +e.getMessage());
        }
        
        
        finally{
            System.out.println("THIS WILL ALWAYS EXCUTES , EVEN IF AN EXCEPTION OCCURS");
        }
    }
}
