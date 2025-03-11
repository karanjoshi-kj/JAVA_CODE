package ARRAY_JAVA;

public class arraysum {
   public static void main(String args[]){
    int [] numbers = {1,2,3,4,5};
    int sum = 0;

    for (int num : numbers) {
        sum += num;
    }
    System.out.println("sum of the arqray elements is:" +sum);
   } 
}
