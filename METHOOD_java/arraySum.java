//SUM OF THE ARRAY ELEMENTSs

package METHOOD_java;

public class arraySum {

    public static int getSum(int[] arr){ // declaration of the function
        int sum = 0;  // define the function 

        // LOOP MAI int num bass eak variable hota hai
        for(int num = 0 ; num < arr.length ; num++){    
        sum += arr[num];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,50};
        int result = getSum(numbers);  // CALL THE FUNCTION
        System.out.println("THE SUM OF THE ARRAY ELEMENTS:" +result);
    }
}


