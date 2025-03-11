public class prime1to50 {
    public static void main(String args[]){
        System.out.println("prime number from 1 to 50:");
        for (int num = 2; num <= 50; num++) {
            int count = 0;

        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                count++;
            }
        }
        if (count == 2) {      //because prime numbers has exactly 2 divisors
            System.out.println(num +" ");
        }
        }
    }
}
