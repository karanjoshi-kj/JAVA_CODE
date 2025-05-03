package MYPACKAGE_JAVA;

import  PACKAGES_JAVA.PRACTICE_PACKAGE.Add;
public class accMEM {
public static void main(String[] args) {
    Add obj = new Add();
    System.out.println("ACCESSED a = " +obj.a);
    System.out.println("ACCESSED b = " +obj.b);

    obj.display();
}    
}
