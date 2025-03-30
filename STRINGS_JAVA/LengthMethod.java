/*
 LENGTH METHOD IN JAVA STRINGS CALCULATE THE LENGTH OF THE STRING:...::. 
 */

package STRINGS_JAVA;

import java.util.*;
public class LengthMethod {
    public static void main(String[]ar){
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER THE NAME");
    String name = sc.nextLine();
    System.out.println("THE NAME IS:" +name);

    System.out.println("THE LENGTH OF THE NAME IS:" +name.length());
    sc.close();
    }
}
