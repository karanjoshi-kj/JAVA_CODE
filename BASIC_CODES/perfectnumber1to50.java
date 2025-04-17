package BASIC_CODES;
//...........:IMPORTANT .............


public class perfectnumber1to50 {
    public static void main(String args[]){
System.out.println("perfect number from 1 to 50 :");

for (int num = 1; num <= 10000; num++) {
    int sum = 0;

for (int i = 1; i < num; i++) {
    if (num%i==0) {
        sum+=i;
    }
}
if (sum == num) {
    System.out.println(num);
}
}
    }
}
