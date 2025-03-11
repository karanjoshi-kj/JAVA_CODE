class Animal {
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {  
    Dog() {  
        super();    // it calls the parent class constructor
        System.out.println("dog is created");
    }
}

public class SUPERCONSTRUCTOR {
    public static void main(String[] ar) {
        Dog dd = new Dog();  
    }
}
