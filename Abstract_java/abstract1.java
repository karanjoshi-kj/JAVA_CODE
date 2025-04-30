package Abstract_java;

abstract class shape {
    int value = 10; // 1. THIS MEANS WE CAM DEFINE THE MEMBRS IN THE ABSTRACT CLASS

    abstract double calculatearea(); // 2. BY DEFAULT ALL THE MEMBERS AND METHODS OF THE ABSTRACT CLASS ARE PUBLIC

    abstract double calculatePerimeter();
}

class Circle extends shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculatearea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class triangle extends shape {
    double sideA, sideB, sideC;

    triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    double calculatearea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // this is herons formula

    }

    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class abstract1 {
    public static void main(String[] ar) {
        shape Circle = new Circle(5);
        System.out.println("THE AREA OF THE CIRCLE IS " + String.format("%.2f", Circle.calculatearea()));
        System.out.println("THE PERIMETER OF THE CIRCLE IS" + String.format("%.2f", Circle.calculatePerimeter(), ar));

        shape triangle = new triangle(3, 4, 5);
        System.out.println("THE AREA OF THE TRIANGLE IS " + String.format("%.2f", Circle.calculatearea()));
        System.out.println("THE PERIMETER OF THE TRIANGLE IS" + triangle.calculatePerimeter());

    };
}
