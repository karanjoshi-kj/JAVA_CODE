package ACCESS_SPECIFIERS_JAVA;

class FirstClass {
    private int num ;
    public void ssetNum(int value){
        num = value;
    System.out.println("PRIVATE NUMBER IS" +num);
    
    }
}

public class SecondClass{
    protected String word = "HELLO ";
}
