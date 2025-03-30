package STRINGS_JAVA;

import java.util.*;
public class CountCharacters {
    public static void main (String[] ar){
    Scanner sc = new Scanner(System.in);

    String userinput = sc.nextLine();

    int letters = 0 ,  digits = 0 , specialchars = 0; 
    for (int i = 0; i < userinput.length(); i++) {
        char ch = userinput.charAt(i);

        if ((ch >= 'A' && ch<= 'Z') || ch >='a' && ch <= 'z') {
            letters++;
        }
        else if (ch >= '0' && ch <= '9') {
            digits++;
        }
        else{
            specialchars++;
        }
    }    
    System.out.println("LETTERS" +letters);
    System.out.println("DIGITS" +digits);
    System.out.println("SPECIAL CHARACTERS" +specialchars);

    sc.close();
}
}
