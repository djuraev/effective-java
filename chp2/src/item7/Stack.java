package src.item7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void push(Object element) {
        this.ensureCapacity();
        elements[size++] = element;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size+1);
        }
    }
}
