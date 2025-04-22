// .:..:......................:..super keyword with constructor overloading.:.....:..................:



package CONSTRUCTORS_IN_JAVA;

class Aa1 {
    Aa1() {
        System.out.println("PARENT CLASS CONSTUCTOR");
    }

    Aa1(String msg) {
        super(); // IT CALLS THE PARENT CLASS DEFAULT CONSTUCTOR
        System.out.println("PARENT CLASS CONSTRUCTOR 11 " + msg);
    }
}

class Bb1 extends Aa1 {
    Bb1(String msg) { 
        super(); // IT CALLS THE PARENT CLASS DEFAULT CONSTUCTOR , BCOZZ IT HAS NO ARGUMENTS IN IT
                 // IT WILL CALL ONLY THE PARAMETERIZED CONSTRUCTOR IN THE PARENT CLASS WHEN WE PASS THE ARGUMENT IN THE SUPER KEYWORD 
        System.out.println("CHILD CLASS CONSTRUCTOR " + msg);
    }
}

public class SuperEX {
    public static void main(String[] args) {
        Bb1 obj = new Bb1("radhey radhey");
    }
}
