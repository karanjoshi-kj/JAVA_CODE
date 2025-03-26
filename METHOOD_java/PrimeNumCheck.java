package METHOOD_java;

public class PrimeNumCheck {
    public static boolean isPrime(int num){   //used boolean datatype here because it returns true or false
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {  //num/2 --> BECAUSE A NUMBER CANNOT HAVE FACTORS GREATER THAN HALF OF ITSELF
            if (num%i==0) {
                return false;
            }
        }
        return true;   //IF NO NUMBERS DIVIDE NUM , IT IS A PRIME NUMBER7
    }
    public static void main(String[]args){
        System.out.println(isPrime(29));
        System.out.println(isPrime(10));
    }
}
