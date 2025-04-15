
// IN MY CODE AT RUNTIME , JAVA DECIDES WHICH SOUND() TO CALL BASED ON THE ACTUAL OBJECT (DOG OR CAt) THE REFERENECE IS POINTING TO :. 

package POLYMORPHISM_JAVA;

class Animal {
    void sound() {
        System.out.println("ANIMAL MAKES A SOUND");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("DOG BARKS");
    }
}

class cat extends Animal {
     void sound() {
        System.out.println("CAT MEOWS");
    }
}

public class MethodOverriding {
    public static void main(String[] ar) {
        Animal obj;
        obj = new dog(); // obj is Animal , but refers to dog object
        obj.sound(); // OUTPUT:

        obj = new cat();
        obj.sound();
    }
}
