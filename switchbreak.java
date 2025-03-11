
import java.util.*;
public class switchbreak{
    public static void main(String args[]){
    System.out.println("enter the week days");
    Scanner sca = new Scanner(System.in);
    int day = sca.nextInt();

    switch (day) {
        case 1: System.out.println("Monday");
        break;
        case 2: System.out.println("tuesday"); 
        break;
        case 3: System.out.println("wednesday");
        break;
        case 4: System.out.println("thusday");
        break;
        case 5: System.out.println("friday");
        break;
        case 6: System.out.println("saturday");
        break;     
        default: System.out.println("invalid case");

    }
    sca.close();
    }
}

