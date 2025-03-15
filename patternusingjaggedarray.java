public class patternusingjaggedarray {
    public static void main(String[] args){
        int rows = 4;
        char[][] pattern = new char[rows][];

        for (int i = 0; i < rows; i++) {
            pattern[i] = new char[i + 1];  

            for (int j = 0; j <= i; j++) {
                pattern[i][j] = '*';  // yha par single quotes ka use isliye kiya hai kyoki JAVA main CHAR value single character hotii hai aur usee single quotes mai store krna pdata hai
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }    
}
