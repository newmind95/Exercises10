package ex1003;

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
