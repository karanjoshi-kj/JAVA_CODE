// PUBLIC , PROTECTED AND DEFAULT ACCESS SPECIFIERS MEMBERS AND FUNCTON CAN ACCESS WITHIN THE OTHER CLASS AS WELL AS SAME PACKAGE BUT "PRIVATE" ACCESS SPECIFIER CANNOT BE ACCESSED IN DIFFRENT CLASS AS WELL AS THE SIMILAR PACKAGE
// ..........it is cleared in two different classes named as CAR and TRUCK.......

package ACCESS_SPECIFIERS_JAVA;

public class Car {
    public static void main(String[] args) {
        Truck obj = new Truck();
        System.out.println(obj.tyre);
    }
}
