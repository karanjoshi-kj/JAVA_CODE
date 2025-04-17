package BASIC_CODES;
// IN THIS CODE WE WILL DO AN EXAMPLE OF FALL THROUGH.:......:

import java.util.*;
public class switchca {
    public static void main(String args[]){
    System.out.println("enter the week days");
    Scanner sca = new Scanner(System.in);
    int day = sca.nextInt();

    switch (day) {
        case 1: System.out.println("Monday");
        case 2: System.out.println("tuesday");       
        case 3: System.out.println("wednesday");
        case 4: System.out.println("thusday");
        case 5: System.out.println("friday");
        case 6: System.out.println("saturday");     
    
        default: System.out.println("invalid case");

    }
    sca.close();
    }
}
