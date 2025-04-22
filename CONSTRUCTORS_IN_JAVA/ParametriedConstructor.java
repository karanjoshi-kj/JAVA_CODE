package CONSTRUCTORS_IN_JAVA;

class Dog{
    String name;
    String color;

    Dog(String n , String c){
        name = n;
        color = c;
    }

    void display(){
        System.out.println("NAME" +name);
        System.out.println("COLOR"+color);
    }
}

public class ParametriedConstructor {
    public static void main(String[] args) {
        Dog dd = new Dog("JACKKIE", "WHITE");
        dd.display();
    }
}
