public class passfail {
    public static void main(String args[]){
        int percentage = 80 ;
        if (percentage >= 90) 
        System.out.println("grade A :");
        else if (80 <= percentage && percentage < 90) {
            System.out.println("grade B");
        }
        else if (70 <= percentage && percentage < 80) {
            System.out.println("grade C");
        }
            else{
                System.out.println(" fail ");
            }
    }
}
