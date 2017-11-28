package study.ducksunlee.chap7.langve;

import java.util.Iterator;
import java.util.List;

/**
 * Created by 이영호 on 2017-10-10.
 */
public class Iterators {
    public static <T> Iterator<T> singleinterrator(List<Iterator<T>> iteratorList) {
        // static inner class
        ListIterator<T> iterator = new ListIterator<T>(iteratorList);

        // non static inner class
        Iterators it = new Iterators();
        ListIteratorNonStatic<T> listIteratorNonStatic = it.new ListIteratorNonStatic(iteratorList);

        return listIteratorNonStatic;
    }

    public static class ListIterator<T> implements Iterator<T> {

        private final Iterator<Iterator<T>> listIterator;
        private Iterator<T> currentIterator;

        public ListIterator(List<Iterator<T>> iterators) {
            this.listIterator = iterators.iterator();
            this.currentIterator = listIterator.next();
        }

        @Override
        public boolean hasNext() {
            if (!currentIterator.hasNext()) {
                if (!listIterator.hasNext()) {
                    return false;
                }

                currentIterator = listIterator.next();

                return hasNext();
            }

            return true;
        }

        @Override
        public T next() {
            hasNext();
            return currentIterator.next();
        }
    }

    public class ListIteratorNonStatic<T> implements Iterator<T> {

        private final Iterator<Iterator<T>> listIterator;
        private Iterator<T> currentIterator;

        public ListIteratorNonStatic(List<Iterator<T>> iterators) {
            this.listIterator = iterators.iterator();
            this.currentIterator = listIterator.next();
        }

        @Override
        public boolean hasNext() {
            if (!currentIterator.hasNext()) {
                if (!listIterator.hasNext()) {
                    return false;
                }

                currentIterator = listIterator.next();

                return hasNext();
            }

            return true;
        }

        @Override
        public T next() {
            hasNext();
            return currentIterator.next();
        }
    }
}
