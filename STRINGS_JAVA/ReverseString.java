package STRINGS_JAVA;

import java.util.*;
public class ReverseString {
    public static void main(String[]ar){
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER A STRING");
    String userinput = sc.nextLine();

    System.out.println("REVERSED STRING");
    for (int i = userinput.length()-1; i >= 0; i--) {
        System.out.println(userinput.charAt(i));
    }
    sc.close();
    }
}
