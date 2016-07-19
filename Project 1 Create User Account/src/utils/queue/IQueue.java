package utils.queue;

import utils.exceptions.QueueUnderflowException;

/**
 * Created by kristab21 on 7/6/16.
 */


public interface IQueue<T> {

    T dequeue() throws QueueUnderflowException;
    boolean isEmpty();
    int size();

}
