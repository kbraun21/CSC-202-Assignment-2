package utils.queue;

import utils.exceptions.QueueOverflowException;
import utils.exceptions.QueueUnderflowException;

/**
 * Created by kristab21 on 7/6/16.
 */

public class ArrayQueue<T> implements IArrayQueue<T> {

    protected final int DEFCAP = 100; //default capacity
    protected T[] queue; //array that holds queue elements
    protected int numElement = 0; //number of elements in the queue
    protected int front = 0; //index of front of queue
    protected int rear; //index of rear of queue

    public ArrayQueue() {
        queue = (T[]) new Object[DEFCAP];
        rear = DEFCAP - 1;
    }

    public ArrayQueue(int maxSize) {
        queue = (T[]) new Object[maxSize];
        rear = maxSize - 1;
    }

    @Override
    public void enqueue(T element) throws QueueOverflowException
    //Adds an element to the rear of the queue, if the queue is full throws Queue Overflow Exception.
    {
      if (isFull())
          throw new QueueOverflowException("Enqueue attempted on a full queue.");
        else {
          rear = (rear + 1) % queue.length;
          queue[rear] = element;
          numElement = numElement + 1;
      }
    }

    @Override
    public T dequeue() throws QueueUnderflowException
    //Removes and returns the front element of the queue, if the queue is empty throws Queue Underflow Exception.
    {
        if (isEmpty())
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        else {
            T toReturn = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            numElement = numElement - 1;
            return toReturn;
        }
    }

    @Override
    public boolean isEmpty()
    //Returns true if this array is empty, otherwise returns false.
    {
        return (numElement == 0);
    }

    @Override
    public boolean isFull()
    //Returns true if this array is full, otherwise returns false.
    {
        return (numElement == queue.length);
    }

    @Override
    public int size()
    //Returns the number of strings in the list.
    {
        return numElement;
    }
}
