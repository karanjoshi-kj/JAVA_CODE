
/*      QUESTION  PRACTICE..
 . Create a Java program to demonstrate method overloading with two methods having different numbers of parameters
Create a Java program to demonstrate method overloading with a mixture of data types and parameter count* 
 
 */

package POLYMORPHISM_JAVA;

class overloading {
    void display(int a) {
        System.out.println("DISPLAY WITH ONE INTEGER" + a);
    }

    void display(int a, int b) {
        System.out.println("DISPLAY WITH TWO INTEGERS" + a + "," + b);
    }

    void display(String message) {
        System.out.println("DISPLAY WITH ONE STRING" + message);
    }

    void display(String message, double number) {
        System.out.println("DISPLAY WITH STRING AND DOUBLE" + message + "," + number);
    }
}

public class MethodOverloading {
    public static void main(String[] ar) {
        overloading obj = new overloading();
        obj.display(10);
        obj.display(10, 20);
        obj.display("karan");
        obj.display("your marks in final  examination", 75.5);
    }
}
