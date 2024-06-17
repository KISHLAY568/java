public class StackOfIntegers {

    // data fields
    private int[] elements; // declaration of array
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    // constructors
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity]; // creation of array
    }

    // getters and setters
    public int getSize() {
        return size;
    }

    // methods
    public void push(int value) {
        // if stack has space
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop() { // size - 1
        return elements[--size];
    }

    public boolean empty() {
        return (size == 0);
    }

    // top element of the stack
    public int peek() {
        return elements[size - 1];
    }

}

// package oops2;

public class TestStackOfIntegers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        StackOfIntegers stack = new StackOfIntegers(); // 16->32->64->128->256->512

        for (int i = 0; i < 500; i++)
            stack.push(i);

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}