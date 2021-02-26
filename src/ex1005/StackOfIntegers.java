package ex1005;

/**
 *
 * @author kristiyan
 */
public class StackOfIntegers {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACTIY = 16;
    
    public StackOfIntegers() {
        this(DEFAULT_CAPACTIY);
    }
    
    public StackOfIntegers(int value) {
        elements = new int[value];
    }
    
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
        }
        elements[size++] = value;
    }
    
    /** Remove a integer from the stack. */
    public int pop() {
        return elements[--size];
    }
    
    /** Return the element from the stack. */
    public int peek() {
        return elements[size - 1];
    }
    
    /** Test wether a stack is empty. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Return the number of elements in the stack. */
    public int getSize() {
        return size;
    }
}
