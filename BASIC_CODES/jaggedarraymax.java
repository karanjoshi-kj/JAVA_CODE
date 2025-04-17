package BASIC_CODES;
public class jaggedarraymax {
    public static void main(String[]args){
        int [][] jaggedarraymax = {
            {3,5,9},
            {1,11},
            {2,3,7,4}
        };
        int max = jaggedarraymax[0][0];

        for (int i = 0; i < jaggedarraymax.length; i++) {
            for (int j = 0; j < jaggedarraymax[i].length; j++) {
                if (jaggedarraymax[i][j] > max) {
                    max = jaggedarraymax[i][j];
                }
            }
        }
        System.out.println("THE MAXIMUM ELEMENT IS" +max);
    }
}
