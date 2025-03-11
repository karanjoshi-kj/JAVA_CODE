class Animal{     // SUPER CLASS 
    String color = "WHITE"; 
}
class dog extends Animal{    //SUBCLASS
    String color = "BLACK";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class SUPERVARIABLE {
 public static void main(String[]ar){
    dog dd = new dog();
    dd.printcolor();
 }   
}
