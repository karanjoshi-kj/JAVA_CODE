package STRINGS_JAVA;

import java.util.*;
public class StringSpace {
    public static void main(String[]ar){
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER A STRING");
    String userinput = sc.nextLine();

    System.out.println("OUTPUT STRING");
    for (int i = 0; i < userinput.length(); i++) {
        System.out.print(userinput.charAt(i) +"  ");
    }
    sc.close();
    }
}
