package INHERITANCE_JAVA;


class Animal{
    void eat(){
        System.out.println("THIS ANIMAL EATS FOOD");
    }
}

class DOG extends Animal{
    void bark(){
        System.out.println("DOG BARKS");
    }
}

class CAT extends Animal{
    void meows(){
        System.out.println("CAT MEOWS");
    }
}

public class HierarchialInheritance {
    public static void main(){
     DOG dd = new DOG();
    dd.bark();
    dd.eat();

    CAT cc = new CAT();
    cc.eat();
    cc.meows();
    }
}
