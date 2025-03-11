/*   PRINT THE FOLLOWING PATTERN..:.
 *******
*****
***
*
*/

public class pyramid10 {
    public static void main(String args[]){

      for (int i = 7; i > 0 ; i-=2) {
        for (int j = 0; j <i; j++) {
            System.out.print("*");
        }
        System.out.println();
      }
   }
    }
