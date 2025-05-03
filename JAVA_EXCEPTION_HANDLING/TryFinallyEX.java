//..................:......:.BUT IN THIS CASE IT CANNOT HANDLE THE EXCEPTION...::::::..............


package JAVA_EXCEPTION_HANDLING;

public class TryFinallyEX {
    public static void main(String[] args) {
        try{
            System.out.println("INDEX TRY BLOCK");
        }
        finally{
            System.out.println("IT ALWAYS RUNS:.");
        }
    }
}
