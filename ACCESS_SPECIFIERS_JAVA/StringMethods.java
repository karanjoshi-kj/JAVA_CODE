package ACCESS_SPECIFIERS_JAVA;

public class StringMethods {
    public void toUpper(String str){
        System.out.println("UPPER CASE" +str.toUpperCase());
    }

    protected void toLower(String str){
        System.out.println("LOWER CASE" +str.toLowerCase());
    }

    private void reverse(String str){
        StringBuilder sb = new StringBuilder(str);

        System.out.println("REVERSED:" +sb.reverse());
        
    }
    public void callReverse(String str){    // IT IS A WRAPPER CLASS BCOZZ PRIVATE METHODS CAN ONLY BE ACCESED WITHIN THE SAME CLASS AND SIMILARY FOR THE ANOTHER PACKAGE YOU CAN'T TELL THEM DIRECTELY
        reverse(str);
    }
}
