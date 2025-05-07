package THREADS_JAVA;

class MyThread extends Thread{
    public void run(){
        System.out.println("THREAD IS RUNNING");
    }
} 

public class BasicProgram {
    public static void main(String[] args) {
       MyThread obj = new MyThread();   // CREATING THREAD OBJECT 
       obj.start(); // IT STARTS A NEW THREAD AND CALLS RUN()

       // IF YOU CALL RUN() DIRECTLY , IT DOES NOT CREATE A NEW THREAD 
}    
}
