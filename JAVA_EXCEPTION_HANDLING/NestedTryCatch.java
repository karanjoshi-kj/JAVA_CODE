package JAVA_EXCEPTION_HANDLING;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = { 10, 20, 30 };
            System.out.println("OUTER TRY BLOCK");

            try {
                int x = arr[5];
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("INNER CATCH" + e);
            }

            int y = 10 / 0;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OUTER CATCH " + e);
        }
        System.out.println("PROGRAM CONTINUES");
    }
}
