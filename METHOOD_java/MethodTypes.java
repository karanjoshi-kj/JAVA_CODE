package METHOOD_java;

public class MethodTypes {
    
    //WITHOUT ARGUMENT , WITHOUT RETURN
    void greet(){
        System.out.println("radhey radhey");
    }

    // WITH ARGUMENT , WITHOUT RETURN
    void printsum(int a , int b){
        int sum = a+b;
        System.out.println("the sum is" +sum);
    }

    //WITHOUT ARGUMENT , WITH RETURN
    static int getnumber(){
        return 38;
    }

    // WITH ARGUMENT , WITH RETURN 
    int multiply(int x , int y){
        return x*y;
    }

    public static void main(String[]ar){
        MethodTypes obj = new MethodTypes();

        obj.greet();
        obj.printsum(10, 10);

        
        System.out.println("the returned number is" +getnumber());   // HERE THE GETNUMBER() METHOD IS STATIC IN NATURE SO WE DON'T REQUIRE ANY OBJECT OF THE CLASS TO CALL THE METHOD . IT CAN BE DIRECTELY CALLED:..

        int result = obj.multiply(5, 4);
        System.out.println("multiplication result" +result);
    }
}
