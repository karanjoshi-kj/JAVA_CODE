package STRING_BUFFER;


public class AppendMethod {
    public static void main(String[]ar){
    StringBuffer sc = new StringBuffer();
    System.out.println("INITIAL CAPACITY" +sc.capacity());

    sc.append("harshit  bisht  ");
    System.out.println("AFTER 16 CHARS" +sc+ " CAPACITY" +sc.capacity());

    System.out.println("after exceding 16 chars" +sc+ "CAPACITY" +sc.capacity());
}
}


