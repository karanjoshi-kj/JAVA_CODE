package BasicsOfClassesAndObjects_java;

class Car {
    String brand;
    String model;
    int year;

    void start() {
        System.out.println(brand + " " + model + "is starting");
    }

    void stop() {
        System.out.println(brand + " " + model + "is starting");
    }
}

public class BasicCode {
    public static void main(String[] ar) {
        Car cc = new Car();
        cc.brand = "TATA";
        cc.model = "SUPRA";
        cc.year = 2025;

        cc.start();
        cc.stop();
    }
}
