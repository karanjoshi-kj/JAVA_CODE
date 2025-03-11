package ARRAY_JAVA;

public class Linearseacharr {
    public static void main(String[]a){
        int [] arr = {10,20,30,40,50};
        int target = 30;

        int index = -1; // * if the element is not found in the array then the index remains -1 means the target is not acheived::
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("element found in the array " +(index+1));  //for my respective users 
        }
        else{
            System.out.println("element is not found in the array");
        }
    }
}
