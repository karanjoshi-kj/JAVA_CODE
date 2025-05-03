package JAVA_EXCEPTION_HANDLING;

public class systemEXIT {
    public static void main(String[] args) {
        try{
            System.out.println("IN TRY BLOCK");
            System.exit(0);
        }
        finally{
            System.out.println("IN FINALLY BLOCK");
        }
    }
}
