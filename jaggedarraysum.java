public class jaggedarraysum {
    public static void main(String[] args){
        int [][] jaggedarray = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        int sum = 0;
        for (int i = 0; i < jaggedarray.length; i++) {
            for (int j = 0; j < jaggedarray[i].length; j++) {
                sum += jaggedarray[i][j];
            }
        }
        System.out.println("sum of the all array elements" +sum);
    }
}
