public class jaggedarray {
    public static void main(String[] args){
        int [][] jaggedarray = new int[3][];

        jaggedarray[0] = new int[2];
        jaggedarray[1] = new int[4];
        jaggedarray[2] = new int[3];

        jaggedarray[0][0] = 1;
        jaggedarray[0][1] = 2;
        jaggedarray[1][0] = 3;
        jaggedarray[1][1] = 4;
        jaggedarray[1][2] = 5;
        jaggedarray[1][3] = 6;
        jaggedarray[2][0] = 7;
        jaggedarray[2][1] = 8;
        jaggedarray[2][2] = 9;

        for (int i = 0; i < jaggedarray.length; i++) {
            for (int j = 0; j < jaggedarray[i].length; j++) {
                System.out.print(jaggedarray[i][j] +" ");
            }
System.out.println();
        }
    }
}
