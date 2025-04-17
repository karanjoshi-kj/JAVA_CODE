package BASIC_CODES;
// RANDOM FUNCTION --> IT GENERATES THE RANDOM NUMBERS 


public class randomfunction {
    public static void main(String[]args){
        System.out.println("RANDOM NUMBERS");
        for (int i = 0; i < 50; i++) {
        int randomnumber = (int)(Math.random() *100);
        System.out.println(randomnumber);        
    }
}

}
