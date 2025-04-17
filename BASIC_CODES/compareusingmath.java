package BASIC_CODES;
//important question
import java.util.Scanner;

public class compareusingmath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        int intNum1 = (int) Math.floor(num1);
        int intNum2 = (int) Math.floor(num2);

        if (intNum1 > intNum2) {
            System.out.println("First number is greater in integer value.");
        } else if (intNum1 < intNum2) {
            System.out.println("Second number is greater in integer value.");
        } else {
            System.out.println("Both numbers are equal in integer value.");
        }

        scanner.close();
    }
}