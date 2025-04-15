/*
  WAP IN JAVA TO EXTENDS AND IMPLEMENT CLASS IN A SAME CODE
 */



package POLYMORPHISM_JAVA;

interface Greetable {
    void Greet();
}

abstract class person {
    abstract void introduce();
}

class student extends person // student is a normal class which extends the person means it inherits the
                             // abstract class and implements the Greetable means irt define the greet method
        implements Greetable {
    void introduce() { // this overrides the introduce method from the person
        System.out.println("I AM A STUDENT"); // overrides means the same method name , same signature but diffrent body
    }

    public void Greet() { // implementation of the greet method from the interface
        System.out.println("GOOD EVENING SIR");
    }
}

public class Question {
    public static void main(String[] ar) {
        student s = new student();
        s.introduce();
        s.Greet();
    }
}
