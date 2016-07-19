package utils.lists;

/**
 * Created by kristab21 on 7/10/16.
 */


public interface IList<T> {

    int size();
    void add(T element);
    boolean contains(T element);
    T remove(T element);
    T get(T element);
    String toString();
    void reset();
    T getNext();
    boolean isEmpty();

}
