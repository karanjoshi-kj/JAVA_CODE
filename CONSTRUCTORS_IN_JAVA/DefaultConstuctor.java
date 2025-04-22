package CONSTRUCTORS_IN_JAVA;

class Car {
    String Model;

    Car() { // DEFAULT CONSTRUCTOR
        Model = "Unknown";
    }

    void display() {
        System.out.println("model" + Model);
    }
}

public class DefaultConstuctor {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.display();
    }
}
