package INHERITANCE_JAVA;


class A{
    void showA(){
        System.out.println("CLASS A METHOD");
    }
}

class B extends A{
      void showB(){
        System.out.println("CLASS B METHOD");
      }
}

class C extends A{
    void showC(){
        System.out.println("CLASS C METHOD");
    }
}

class D extends B{
    void showD(){
        System.out.println("CLASS D METHOD");
    }
}
public class HybridInheritance {
    public static void main(String[] ar){
       D obj = new D();
       obj.showA();
        obj.showB();
        obj.showD();    // HERE obj.showC() is not accesible bcozz D doesn't extend C
    }
}
