package EXCEPTION_HANDLING;

    class MyCustomException extends Exception{
        public String getmessage(){
            return "AGE MUST BE 18 OR OLDER";
        }
    }

    public class UserDefinedException {
    public static void main(String[] args) {
        try {
            CheckAge(15);
        }
         catch (MyCustomException e) {
               System.out.println("CAUGHT EXCEPTION" +e.getMessage());
        }
        System.out.println("PROGRAM ENDED ABNORMALLY");
    }

    static void CheckAge(int age)
    throws MyCustomException{
        if(age<18){
            throw new MyCustomException();
        }
        else{
            System.out.println("ACCESS GRANTED");
        }
    }
}
