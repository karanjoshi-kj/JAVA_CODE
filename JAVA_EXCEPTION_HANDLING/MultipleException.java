package JAVA_EXCEPTION_HANDLING;

public class MultipleException {
    public static void main(String[] args) {
        try {
            int [] numbers = {1,2,3};
            int result = 10/0; // AIRTHMETIC EXCEPTION

            System.out.println(numbers[2]);
        }
         catch (ArithmeticException e) {
          System.out.println("AIRTHMETIC ERROR" +e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ee){
            System.out.println("ARRAY INDEX ERROR" +ee.getMessage());
        }
        catch(Exception GLOBAL){  // IT IS A GLOBAL EXCEPTION HANDLER
           System.out.println("GENRAL ERRORS" +GLOBAL.getMessage());
        }
        System.out.println("program continues");
    }
}
