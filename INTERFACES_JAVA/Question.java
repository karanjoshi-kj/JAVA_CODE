/*Write a Java program to create an
interface Shape
with the
getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes
*/

package INTERFACES_JAVA;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
     double length , width ;

     Rectangle(double l , double w){
        length = l;
        width = w;
     }

     public double getArea(){
        return length*width;
     }
}

class Circle implements Shape{
    double radius;

    Circle(double r){
        radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape{
    double base , height;

    Triangle(double b , double h){
        base = b;
        height = h;
    }

    public double getArea(){
        return 0.5 * base * height;
    }
}

public class Question {
    public static void main(String[] ar) {
    
    Shape rect = new Rectangle(10, 5);
    Shape circ = new Circle(7);
    Shape tri = new Triangle(8,4);

    System.out.println("RECTANGLE'S AREA" +rect.getArea());
    System.out.println("CIRCLE'S AREA" +String.format("% .2f", circ.getArea()));
    System.out.println("TRIANGLE'S AREA" +tri.getArea());
    }
}
