

// ..........:.METHOD OVERRIDING UING INTERFACE AND ABSRTRACT CLASS IN A SINGLE PROGRAM.....


package POLYMORPHISM_JAVA;

interface Animal {
    void sound();
}

abstract class Animal1 {
    abstract void sound();
}

class dog implements Animal {
    public void sound() {
        System.out.println("DOG BARKS");
    }
}

class dog1 extends Animal1 {
    public void sound() {
        System.out.println("DOG BARKS");
    }
}

public class Question1 {
    public static void main(String[] ar) {
        dog1 obj = new dog1();
        obj.sound();
    }
}
