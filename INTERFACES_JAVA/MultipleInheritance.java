package INTERFACES_JAVA;

interface Car{
    void start();
    int mileage = 10;
}

interface Engine{
    void rev();
}

class Sportscar implements Car , Engine{
    public void start(){
        System.out.println("THE CAR IS STARTING ");
    }

    //mileage = 20;  ....ERROR....  BCOZZ MILEGAE IS DEFINED IN INTERFACE  AND IT IS MY DEFAULT FINAL IN NATURE.... 
    
    public void rev(){
        System.out.println("ENGINE IS STARTING");
    }
}

public class MultipleInheritance {
    public static void main(String[] ar){

        Sportscar sc = new Sportscar();
        sc.start();
        sc.rev();
    }

}
