class animal{
    void eat(){
        System.out.println("EATING");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("EATING BREAD");
    }
    void bark(){
        System.out.println("BARKING");
    }
void work(){
    super.eat();
    bark();
}
}

public class SUPERMETHOOD {
public static void main(String[]ar){
    dog dd = new dog();
    dd.bark();
    dd.eat();
    dd.work();
}    
}
