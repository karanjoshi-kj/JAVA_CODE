//.....::..Trim method removes the spaces from the start and end of the string , not from the middle:.......

package STRING_BUFFER;

public class TrimMethod {
    public static void main(String[] ar){
        StringBuffer sb = new StringBuffer("   karan joshi   ");
        sb.trimToSize();

        System.out.println(sb);
    }
}
