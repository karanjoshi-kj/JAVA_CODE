package ACCESS_SPECIFIERS_JAVA;


 class FourthClass extends SecondClass{
    String word1 = word.toLowerCase();
}
public class ThirdClass{
    public static void main(String[] args) {
        FourthClass obj = new FourthClass();
        System.out.println(obj.word1);
    }
}