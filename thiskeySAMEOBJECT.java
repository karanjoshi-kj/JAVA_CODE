/*A reference variable in Java is a variable that holds the MEMORY ADDRESS (reference) of an object rather than the object itself. It points to the location where the object is stored in the heap.*/


public class thiskeySAMEOBJECT {
    void show(){
        System.out.println(this);
    }

    public static void main(String[]args){
    thiskeySAMEOBJECT obj = new thiskeySAMEOBJECT(); //here obj is the reference variable                   
    System.out.println(obj);
    obj.show();
    }
}
