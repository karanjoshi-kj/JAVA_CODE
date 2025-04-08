package INHERITANCE_JAVA;

class Animal{
    void sound(){
        System.out.println("ANIMAL MAKES A SOUND");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("DOG BARKS");
    }
}
public class SingleInheritance {
    public static void main(String[] ar){
    Dog d = new Dog();
    d.sound();
    d.bark();
    }
}
