package CONSTRUCTORS_IN_JAVA;

class A{
    
    A(){
      super();     // THE JAVA COMPILER EMBEDS THE DEFAULT CONSTRUCTOR CLASS object() WHICH IS THE IN-BUILT CLASS  
                    // IN JAVA
    System.out.println("CLASS A");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("CLASS B");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        B obj = new B();
    }
}
