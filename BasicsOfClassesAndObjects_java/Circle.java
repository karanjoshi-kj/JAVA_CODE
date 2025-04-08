package BasicsOfClassesAndObjects_java;


class Circlequestion {
    double radius;

    void calculatearea(){
        double area = Math.PI * radius*radius;
        System.out.println("AREA:" +String.format("% .2f",area));   //STRING FORMAT GIVES VALUE UPTO TWO DECIMAL PLACE
    }

    void calculatecircumference(){
        double circumference = 2 * Math.PI *radius;
        System.out.println("CIRCUMFERENCE" +String.format("% .2f", circumference));
    }
}

public class Circle{
    public static void main(String[]ar){
        Circlequestion cc = new Circlequestion();
        cc.radius = 5.0;

        System.out.println("RADIUS" +cc.radius);
        cc.calculatearea();
        cc.calculatecircumference();
    }
}
