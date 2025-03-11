public class test {
    public static void main(String args[]){
        for (int i = 1; i <= 5; i++) {
            if (i==3) {
                continue;   //exits loop when i equals to 3
            }
            System.out.println(i);
        }
        System.out.println("loop ended");
    }
}
