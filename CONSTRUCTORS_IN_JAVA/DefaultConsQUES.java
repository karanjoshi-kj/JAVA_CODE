
               //...........:.:...:....:.......QUESTION...:...:..:.::....

/*Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
*/

package CONSTRUCTORS_IN_JAVA;

class Book {
    String tittle;
    String author;
    double price;

    Book() { // DEFAULT CONSTRUCTOR
        tittle = "UNKNOWN";
        author = "UNKNOWN";
        price = 0.0;
    }

    Book(String t, String a) { // 2-ARG PARAMETERIZED CONSTRUCTOR
        tittle = t;
        author = a;
        price = 0.0;
    }

    Book(String t, String a, double p) { // 3-ARG PARAMETERIZED CONSTRUCTOR
        tittle = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("TITTLE:" + tittle);
        System.out.println("AUTHOR:" + author);
        System.out.println("PRICE" + price);
    }
}

public class DefaultConsQUES {
    public static void main(String[] args) {
        Book b1 = new Book(); // DEFAULT CONSTRUCTOR
        Book b2 = new Book("WINGS OF FIRE", "A.P.J ABDUL KALAM"); // 2-ARG PARAMETERIZED CONSTRUCTOR
        Book b3 = new Book("CHANKYA NITTHI", "BY AACHRAYA CHANKYA", 599.99); // 3-ARG PARAMETERIZED CONSTRUCTOR

        b1.display();
        b2.display();
        b3.display();
    }
}
