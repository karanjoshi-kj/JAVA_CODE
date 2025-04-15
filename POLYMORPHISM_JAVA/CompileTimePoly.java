package POLYMORPHISM_JAVA;



class Add{
    void Add(int a , int b){
        System.out.println("THE SUM OF TWO INTEGERS" +(a+b));
    }

    void Add(int a , int b , int c){
        System.out.println("THE SUM OF THREE INTEGERS" +(a+b+c));
    }

    void Add(double a , double b){
        System.out.println("THE SUM OF TWO DOUBLES" +(a+b));
    }
}
public class CompileTimePoly {
    public static void main(String[]ar){
    Add ad = new Add();
    ad.Add(5, 10);
    ad.Add(3.5, 5.5);
    ad.Add(5, 10, 5);
    }
}


