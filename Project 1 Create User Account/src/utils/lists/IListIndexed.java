package utils.lists;

import utils.lists.IList;

/**
 * Created by kristab21 on 7/10/16.
 */

public interface IListIndexed<T> extends IList<T> {

    void add(int index, T element);
    T set(int index, T element);
    T get(int index);
    int indexOf(T element);
    T remove(int index);

}
