package BASIC_CODES;
public class MINelementjaggedarray {
    public static void main(String[]args){
        int[][] MINelementjaggedarray = {
            {3,5,9},
            {1,11},
            {2,8,7,4}
        };
        int min = MINelementjaggedarray[0][0];

        for (int i = 0; i < MINelementjaggedarray.length; i++) {
            for (int j = 0; j < MINelementjaggedarray[i].length; j++) {
                if (MINelementjaggedarray[i][j]<min) {
                    min = MINelementjaggedarray[i][j];
                }
            }
        }
        System.out.println("THE MINIMUM ELEMENT IS " +min);
    }
}
