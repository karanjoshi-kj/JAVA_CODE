package BasicsOfClassesAndObjects_java;

import java.util.*;
class rectangle {
    double width , height;

    rectangle (double w , double h){
        width = w;
        height = h;
    }
    double getarea(){
        return width*height;
    }
    double getperimeter(){
        return 2*(width+height);
    }
}

public class Rectangle{
    public static void main(String[] ar){
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER THE WIDTH");
    double width = sc.nextDouble();

    
    System.out.println("ENTER THE HEIGHT");
    double height = sc.nextDouble();

    rectangle rc = new rectangle(width, height);

    System.out.println("AREA" + rc.getarea());
    System.out.println("PERIMETER" +rc.getperimeter());

    sc.close();
    }
} 
