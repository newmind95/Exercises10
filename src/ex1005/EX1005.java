package ex1005;

/**
 * (Displaying the prime factors) Write a program that prompts the user to enter
    a positive integer and displays all its smallest factors in decreasing order. For
   example, if the integer is 120 , the smallest factors are displayed as 5 , 3 , 2 , 2 ,
   2 . Use the StackOfIntegers class to store the factors (e.g., 2 , 2 , 2 , 3 , 5 ) and
   retrieve and display them in reverse order.
 */

/**
 *
 * @author kristiyan
 */
public class EX1005 {
    /** Main method. */
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        
        // Create a scanner.
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Prompt the user to enter a positive integer.
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        
        smallestFactor(num, stack);
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
    
    
    public static void smallestFactor(int num, StackOfIntegers stack) {
        // Number to be divided.
        int divide = 2;
        while (num / divide != 1) {
            if (num % divide == 0) {
                stack.push(divide);
                num /= divide;
            } else {
                divide++;
            }
        }
        stack.push(num);
    }
}
