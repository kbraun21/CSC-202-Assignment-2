package utils.queue;

import utils.exceptions.QueueUnderflowException;
import utils.stack.LinkedListNode;

/**
 * Created by kristab21 on 7/6/16.
 */

public class LinkedListQueue<T> implements ILinkedListQueue<T> {

    LinkedListNode<T> front; //reference to front of this queue
    LinkedListNode<T> rear; //reference to end of this queue
    int numElement = 0;

    public LinkedListQueue() {
        front = null;
        rear = null;
    }

    public LinkedListQueue(int numNodes) {
    }

    @Override
    public void enqueue(T element)
    //Adds an element to the rear of the queue
    {
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);
        if (front == null) {
            front = newNode;
        } else {
            rear.setPointer(newNode);
        }
        rear = newNode;
        numElement++;
    }

    @Override
    public T dequeue() throws QueueUnderflowException
    //Removes and returns the front element of the queue, if the queue is empty throws Queue Underflow Exception.
    {
        if (isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        }
        T element = front.getElement();
        if (front == rear) {
            rear = null;
        }
        front = front.getPointer();
        numElement--;
        return element;
    }

    @Override
    public boolean isEmpty()
    //Returns true if this list is empty, otherwise returns false.
    {
        return (front == null);
    }

    public int size()
    //Returns the number of strings in the list.
    {
        return numElement;
    }

}
