public class jaggedarraysquarecube {
    public static void main(String[] ar){
        int[][] jaggedarraysquarecube = {
            {3,6,9},
            {2,11},
            {8,5,7,4}
        };
        System.out.println("enter the elements");
        for (int i = 0; i < jaggedarraysquarecube.length; i++) {
            for (int j = 0; j < jaggedarraysquarecube[i].length; j++) {
                int num = jaggedarraysquarecube[i][j];

                if (num%2==0) {
                    System.out.print(num * num);
                }
                else{
                    System.out.print(num * num * num);
                }
            }
            System.out.println();
        }
    }
}
