package ARRAY_JAVA;

public class averagearr {
    public static void main(String[] a){
        int [] numbers = {1,2,3,4,5};
        int sum =0;

        for (int num : numbers) {
        sum += num;
        }
     int avg = sum / numbers.length;
     System.out.println("the average of the array elements is:" +avg);    
    }
}
