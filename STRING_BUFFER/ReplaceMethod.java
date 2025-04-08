package STRING_BUFFER;

public class ReplaceMethod {
    public static void main(String[] ar){
        StringBuffer sb = new StringBuffer("karan joshi");
        sb.replace(6, 10, "harshita");

        System.out.println(sb);
    }
}
