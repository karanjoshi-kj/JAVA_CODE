package BASIC_CODES;
import java.util.Scanner;

public class vowelcons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0); //only stores the forst character

        switch (ch) {
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                System.out.println(ch + " is a Consonant.");
        }

        sc.close();
    }
}