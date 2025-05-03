//INFINITE LOOP IN TRY BLOCK 

package JAVA_EXCEPTION_HANDLING;

public class InfiniteLoopInTry {
    public static void main(String[] args) {
        try {
            System.out.println("IN TRY BLOCK");
            while(true){
            System.out.println("LOOP RUNS FOREVER");
           
        }
    } 
    finally{
        System.out.println("IN FINALLY BLOCK");
    }
    }
}
