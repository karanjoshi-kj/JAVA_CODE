package STRING_BUFFER;

public class CapacityMethod {
    public static void main(String[] ar) {
        StringBuffer sc = new StringBuffer(" "); // IT ALWAYS STORES 16 CHARACTERS IN HEAP FOR THE OBJECT OF THE STRING BUFFER
        
        System.out.println(+sc.capacity());
        sc.append("HELLO");    // it gives the value to the string in 16 bits charaters
        System.out.println("UPDATED CAPACITY" +sc.capacity());
        System.out.println(sc);
    }
}
