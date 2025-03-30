package STRINGS_JAVA;

import java.util.*;

public class UpperLowercase {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String str = sc.nextLine();

        char[] arr = str.toCharArray(); // because strings are immutable in java so convert it to array first
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } 
            else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        String result = new String(arr);

        System.out.println("CONVERTED STRING" + result);
        sc.close();
    }
}
