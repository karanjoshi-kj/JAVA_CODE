package CONSTRUCTORS_IN_JAVA;

class Aa{
    Aa(){    // DEFAULT CONSTUCTOR
        System.out.println("PARENT CLASS CONSTUCTOR");
    }
}

class Bb extends Aa{
    Bb(String msg){
        super();   // IT CALLS THE PARENT CLASS DEFAULT CONSTUCTOR
        System.out.println("CHILD CLASS CONSTRUCTOR "+msg);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Bb obj = new Bb("radhey radhey");
    }
}
