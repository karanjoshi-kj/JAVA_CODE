package INTERFACES_JAVA;

interface car {
    void music();

    void tyre();
}

class mahindra implements car {
    public void music() { // WE HAVE USED PUBLIC KEYWORD HERE BCOZZ INTERFACES SAYS "ANY CLASS CAN USE
                          // THIS METHOD".
        System.out.println("MUSIC IS PLAYING");
    }

    public void tyre() {
        System.out.println("TYRES ARE IN GGOD CONDITION");
    }
}

public class BasicCode {
    public static void main(String[] ar) {
        mahindra mh = new mahindra();
        mh.music();
        mh.tyre();
    }
}
