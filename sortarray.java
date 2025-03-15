import java.util.Scanner;
public class sortarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sortarray = new int[n];
        int index = 0;
//if value is negative
        for(int num : arr){
            if (num < 0) {
                sortarray[index++] = num;
            }
        }
//if value is zero
        for (int num : arr) {
            if (num == 0) {
                sortarray[index++] = num;
            }
        }
//if value is positive
        for(int num : arr){
            if (num > 0) {
                sortarray[index++] = num;
            }
        }

        System.out.println("SORTED ARRAY");
        for(int num : sortarray){
            System.out.print(num +" ");
        }
        sc.close();
    }
}
