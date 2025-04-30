package Abstract_java;

abstract class Bird {
    abstract void fly();

    abstract void makesound();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("EAGLE FLIES HIGH"); 
    }

    void makesound() {
        System.out.println("EAGLE'S SOUND");
    }
}

class Hawk extends Bird {
    void fly() {
        System.out.println("HAWK FLIES GOOD");
    }

    void makesound() {
        System.out.println("HAWK'S SOUND");
    }
}

public class abstract2 {
    public static void main(String[] ar) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();

        System.out.println("eagle:");
        eagle.fly();
        eagle.makesound();

        System.out.println("HAWK:");
        hawk.fly();
        hawk.makesound();
    }
}
