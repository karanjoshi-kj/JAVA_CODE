/*
 * IT PRINTS -->
 * DESCRIPTIION
 */

package JAVA_EXCEPTION_HANDLING;

public class getMessage {
    public static void main(String[] args) {
        try {
            int a = 10 , b = 0;
            int result1 = a/b;
        } 
        
        catch (Exception e) {
            System.out.println("using getmessage()");

            System.out.println(e.getMessage());
        }
    }
}
