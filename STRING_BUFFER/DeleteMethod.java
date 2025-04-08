package STRING_BUFFER;

public class DeleteMethod {
    public static void main(String[] ar){
        StringBuffer sb = new StringBuffer("karan joshi");
        sb.delete(3, 6);
        System.out.println(sb);
    }
}
