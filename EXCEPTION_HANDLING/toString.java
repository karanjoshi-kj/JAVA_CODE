/*
 * toString -->
 * IT PRINTS ALL
 * EXCEPTION NAME
 * DESCRIPTION
 */

package EXCEPTION_HANDLING;

public class toString {
    public static void main(String[] args) {
        try {
            int a = 10 , b = 0;
            int result = a/b;
        }
        
        catch (Exception e) {
            System.out.println("USING TOSTRING()");

            System.out.println(e.toString());
        }
    }
}
