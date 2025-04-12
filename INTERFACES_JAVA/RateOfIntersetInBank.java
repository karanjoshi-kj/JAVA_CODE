package INTERFACES_JAVA;

interface Bank {
    double rate_of_interest();
}

class PNB implements Bank {
    public double rate_of_interest() {
        return 9.5;
    }
}

class HDFC implements Bank {
    public double rate_of_interest() {
        return 9;
    }
}

class SBI implements Bank {
    public double rate_of_interest() {
        return 10.5;
    }
}

public class RateOfIntersetInBank {
    public static void main(String[] ar) {
        Bank bb;
        bb = new PNB();
        System.out.println("PNB RATE OF INTEREST" + bb.rate_of_interest() + "%");

        bb = new HDFC();
        System.out.println("HDFC RATE OF INTEREST" + bb.rate_of_interest() + "%");

        bb = new SBI();
        System.out.println("SBI RATE OF INTEREST" + bb.rate_of_interest() + "%");
    }
}
