package utils.stack;

import utils.exceptions.StackOverflowException;

/**
 * Created by kristab21 on 7/6/16.
 */

public interface IArrayStack <T> extends IStack<T> {

    void push(T element) throws StackOverflowException;
    boolean isFull();

}
