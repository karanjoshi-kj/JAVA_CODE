package BASIC_CODES;
import java.util.Scanner;

public class daysmonth { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days in the month: ");
        int days = sc.nextInt();

        switch (days) {
            case 31:
                System.out.println("Months with 31 days: January, March, May, July, August, October, December");
                break;
            case 30:
                System.out.println("Months with 30 days: April, June, September, November");
                break;
            case 28: case 29:
                System.out.println("Month with 28 or 29 days: February");
                break;
            default:
                System.out.println("Invalid number of days!");
        }

        sc.close();
    }
}