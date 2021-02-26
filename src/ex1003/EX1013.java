package ex1003;

/**
 * (The MyInteger class) Design a class named MyInteger . The class contains:
■ An int data field named value that stores the int value represented by this
  object.
■ A constructor that creates a MyInteger object for the specified int value.
■ A getter method that returns the int value.
■ The methods isEven() , isOdd() , and isPrime() that return true if the
  value in this object is even, odd, or prime, respectively.
■ The static methods isEven(int) , isOdd(int) , and isPrime(int) that
 return true if the specified value is even, odd, or prime, respectively.
■ The static methods isEven(MyInteger) , isOdd(MyInteger) , and
 isPrime(MyInteger) that return true if the specified value is even, odd,
 or prime, respectively.
■ The methods equals(int) and equals(MyInteger) that return true if
 the value in this object is equal to the specified value.
■ A static method parseInt(char[]) that converts an array of numeric
 characters to an int value.
■ A static method parseInt(String) that converts a string into an int
 value.
Draw the UML diagram for the class and then implement the class. Write a 
client program that tests all methods in the class.
 */

/**
 *
 * @author kristiyan
 */
public class EX1013 {

    /**
     * Main method.
     */
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(50);
        System.out.println(myInteger1.isEven());
        MyInteger myInteger2 = new MyInteger(33);
        System.out.println(myInteger2.isOdd());
        MyInteger myInteger3 = new MyInteger(29);
        System.out.println(myInteger3.isPrime());
        MyInteger myInteger4 = new MyInteger(55);
    }
}
