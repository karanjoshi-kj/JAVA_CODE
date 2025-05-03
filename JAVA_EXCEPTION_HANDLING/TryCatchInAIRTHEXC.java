package JAVA_EXCEPTION_HANDLING;

public class TryCatchInAIRTHEXC {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int RESULT;

        try {
            RESULT = a / b;

            System.out.println("result" + RESULT);
        } catch (Exception e) { // IN BRACES Exception TELLS THE TYPE OF EXCEPTION AND e IS THE REFERENCE
                                // VARIABLE WHICH HOLDS THE OBJECT OF EXCEPTION
            System.out.println("EXCEPTION CAUGHT" + e.getMessage());
        }
        System.out.println("PROGRAM CONTINUES");
    }
}
