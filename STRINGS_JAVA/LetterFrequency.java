package STRINGS_JAVA;

import java.util.*;

public class LetterFrequency {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A STRING");
        String str = sc.nextLine();

        System.out.println("ENTER THE LETTER");
        char letter = sc.next().charAt(0); // yha par sc.next() reads the next word from the input aur.charAt(0) ye
                                           // index value dega
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println("frequency of" + letter + "in the given string" + count);
        sc.close();
    }
}
