// THIS KEYWORD

package CONSTRUCTORS_IN_JAVA;

class Additiion{
    int a;
    int b;

    Additiion(int a , int b){
        this.a = a;
        this.b = b;
    }

    void add(){
        int sum = this.a + this.b;
        System.out.println("SUM" +sum);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Additiion obj = new Additiion(10, 20);
        obj.add();
    }
}
