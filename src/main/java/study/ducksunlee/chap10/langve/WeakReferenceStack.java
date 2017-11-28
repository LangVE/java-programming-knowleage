package study.ducksunlee.chap10.langve;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by langve on 2017. 11. 21..
 */
public class WeakReferenceStack<T> {
    private final List<WeakReference<T>> stackReferences;
    private int stackPointer = 0;

    public WeakReferenceStack() {
        this.stackReferences = new ArrayList<>();
    }

    public void push(T element) {
        this.stackReferences.add(stackPointer, new WeakReference<>(element));
        stackPointer++;
    }

    public T pop() {
        stackPointer--;
        return this.stackReferences.get(stackPointer).get();
    }

    public T peek() {
        return this.stackReferences.get(stackPointer - 1).get();
    }
}
