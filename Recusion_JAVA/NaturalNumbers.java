package Recusion_JAVA;

public class NaturalNumbers{

    public static void  printnumbers(int n){
        if (n > 50) {
            return ;
        }
        System.out.println(n +" ");
        printnumbers(n+1);
    }
    public static void main(String[]ar){
        printnumbers(1);
    }

    }
