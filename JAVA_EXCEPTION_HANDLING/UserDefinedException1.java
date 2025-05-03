package JAVA_EXCEPTION_HANDLING;

class MyException extends Exception { // MyException IS USER DEFINED EXCEPTION
    MyException(String message) { // CONSTRUCTOR
        System.out.println("EXCEPTION CREATED" + message);
    }
}

public class UserDefinedException1 {
    public static void CheckNumber(int number) throws MyException { // STATIC --> JVM RUN THIS METHOD WITHOUT NEEDING TO CREATE AN OBJECT:
        // this method throws myexception object:
        if (number < 0) {
            throw new MyException("NEGATIVE NUMBER IS NOT ALLOWED");
        } else {
            System.out.println("THE NUMBER IS" + number);
        }
    }

    public static void main(String[] args) {
        try {
            CheckNumber(-10);
        } catch (MyException e) {
            System.out.println("CAUGHT EXCEPTION");
        }
    }
}
