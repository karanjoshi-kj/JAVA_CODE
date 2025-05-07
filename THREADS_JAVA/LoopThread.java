package THREADS_JAVA;
   

class MyThread1 extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("CHILD THREAD" +i);
        }
    }
}
public class LoopThread {
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        obj.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("MAIN THREAD" +i);
        }
    }
}


