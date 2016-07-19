package utils.queue;

import utils.exceptions.QueueOverflowException;

/**
 * Created by kristab21 on 7/6/16.
 */


public interface IArrayQueue<T> extends IQueue<T> {

    void enqueue(T element) throws QueueOverflowException;
    boolean isFull();

}
