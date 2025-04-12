package INTERFACES_JAVA;

interface Creata{
    void music();
}

interface Tata{
    void music();
}

interface Mahindra{
    void music();
}

class Car implements Creata , Tata , Mahindra{
    public void music(){
        System.out.println(" MUSIC IS PLAYING...");
    }
}
public class AmbiguityINMultiINH {
    public static void main(String[] ar){
        Car cc = new Car();
        cc.music();

    }
}
