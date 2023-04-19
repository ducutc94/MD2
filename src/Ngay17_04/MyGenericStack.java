package Ngay17_04;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static javafx.beans.binding.Bindings.isEmpty;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();

    }

    public void push(T element) {
        stack.addFirst(element);

    }

    public int size() {
        return stack.size();
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    boolean isEmpty() {
        if (stack.size() == 0) {
            return false;
        }
        return true;
    }
    }
