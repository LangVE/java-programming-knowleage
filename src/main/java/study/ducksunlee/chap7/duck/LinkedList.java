package study.ducksunlee.chap7.duck;

/**
 * Created by 이상덕 on 2017-09-21.
 */
public class LinkedList<T> {
    private T element;
    private LinkedList<T> next;

    public LinkedList(T element, LinkedList<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public LinkedList<T> getNext() {
        return next;
    }
}
