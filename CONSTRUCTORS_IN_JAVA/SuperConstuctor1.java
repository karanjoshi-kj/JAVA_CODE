package CONSTRUCTORS_IN_JAVA;

class Animal{
    Animal(){
        System.out.println("ANIMAL IS CREATED");
    }

    void sound(){
        System.out.println("ANIMAL MAKES THE SOUND");
    }
}


class Cat extends Animal{
    Cat(){
        super();    // IT CALLS THE ANIMAL CONSTUCTOR
        System.out.println("CAT IS CREATED");
    }

    void sound(){
        super.sound(); // IT CALLS ANIMAL'S SOUND METHOD
        System.out.println("CAT MEOWS");
    }
}

public class SuperConstuctor1 {
    public static void main(String[] args) {
         Cat dd = new Cat();
         dd.sound();       
    }
}
