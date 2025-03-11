package ARRAY_JAVA;

public class positioninsert {
    public static void main(String[] a){
        int[] arr = {10,20,30,40,50};
       int element = 25;
       int position = 2;

       for (int i = arr.length-1; i >= position-1; i--) {
        arr[i] = arr[i-1];
       }

      arr[position] = element;
      System.out.println("array after insertion");
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
      }
    }
}
