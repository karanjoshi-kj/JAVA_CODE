public class perfectnumbercount {
    public static void main(String[]args){
        int [][] jaggedarray = {
            {6,15,28},
            {12,496},
            {8,24,8128,644}
        };
        int count = 0;

        for (int i = 0; i < jaggedarray.length; i++) {
            for (int j = 0; j < jaggedarray[i].length; j++) {
                int num = jaggedarray[i][j];

                int sum = 1;  //1 IS ALWAYS A DIVISOR
                for (int k = 2; k <= num/2; k++) { //WE STARTED FROM  K= 2 BECAUSE 1 IS ALWAYS A DIVISOR
                    if (num%k==0) {    // YE CHECK KAR ARA H KI K IS A DIVISOR OF num OR NOT
                        sum += k;
                    }
                }
                if (sum == num && num > 1) {
                    count++;
                }
            }
        }
        System.out.println("PERFECT NUMBERS COUNT" +count);
    }
}
