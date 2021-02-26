package ex1003;

/**
 * -value: int
 * ---------------
 * -MyInteger(value: int)
 * -getValue(value: int) int
 * -isEven() boolean
 * -isOdd() boolean
 * -isPrime() boolean
 * -isEven(value: MyInteger) static boolean
 * -isOdd(value: MyInteger) static boolean
 * -isPrime(value: MyInteger) static boolean
 * -equals(value: int) boolean
 * -equals(value: MyInteger) boolean
 * -parseInt(value: char[]) static
 * -parseInt(value: String) static
 */

/**
 *
 * @author kristiyan
 */
public class MyInteger {
    private int value;
    
    /** Constructor that takes an integer value. */
    public MyInteger(int value) {
        this.value = value;
    }
    
    /** Method to return the value. */
    public int getValue(int value) {
        return value;
    }
    
    /** Test whether a number is even. */
    public boolean isEven() {
        return isEven(value);
    }
    
    /** Test whether a number is odd. */
    public boolean isOdd() {
        return isOdd(value);
    }
    
    /** Test whether a number is prime. */
    public boolean isPrime() {
        return isPrime(value);
    }
    
    /** Test whether a number is even. */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    
    /** Test whether a number is odd. */
    public static boolean isOdd(int value) {
         return value % 2 != 0;
    }
    
    /** Test whether a number is prime. */
    public static boolean isPrime(int value) {
        boolean isPrime = false;
        for (int divide = 2; divide <= value / 2; divide++) {
            if (divide % value == 0) 
                isPrime = true;
            break;
        }
        return isPrime;
    }
    
    public static int parseInt(char[] ch) {
       StringBuilder st = new StringBuilder();
       for (int i = 0; i < ch.length; i++) {
           st.append(ch[i]);
       }
       return Integer.parseInt(ch.toString());
    }
    
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
