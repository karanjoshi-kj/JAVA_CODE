package STRINGS_JAVA;

import java.util.Scanner;
public class StringUsingUser {
    public static void main(String[]ar){
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER A STRING");
    String userinput = sc.nextLine();

    System.out.println("THE STRING YOU ENTERED");
   for (int i = 0; i < userinput.length(); i++) {
        System.out.println(userinput.charAt(i));
    }
    
    sc.close();   
    }
}
