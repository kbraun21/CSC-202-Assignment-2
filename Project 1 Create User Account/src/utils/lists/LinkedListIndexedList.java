/*  package utils.lists;


import utils.exceptions.IndexOutOfBoundsException;
import utils.queue.IQueue;
import utils.stack.LinkedListNode;


/**
 * Created by kristab21 on 7/10/16.
 */

/* public class LinkedListIndexedList<T> implements IListIndexed<T> {

    protected int numElements;
    protected LinkedListNode<T> currentPos;

    protected boolean found;
    protected LinkedListNode<T> location;
    protected LinkedListNode<T> previous;
    protected LinkedListNode<T> LLindexedList;

    LinkedListNode<T> front;
    LinkedListNode<T> rear;

    public void LinkedListIndexedList() {
        numElements = 0;
        LLindexedList = null;
        currentPos = null;
    }


    protected void find(T target) {
        location = LLindexedList;
        found = false;
        while (location != null) {
            if (location.getElement().equals(target)) {
                found = true;
                return;
            } else {
                previous = location;
                location = location.getPointer();
            }
        }
    }

    @Override
    public void add(int index, T element) {
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public T remove(int index) { return null; }

    @Override
    public int size()
    // returns the number of strings in the list.
    {
        return numElements;
    }


    @Override
    public void add(T element)
    //Passes object argument and adds it to the list.
    {
        LinkedListNode<T> prevLoc;
        LinkedListNode<T> location;
        T listElement;

        location = LLindexedList;
        prevLoc = null;

        while (location != null) {
            listElement = location.getElement();
            if (((Comparable) listElement).compareTo(element) < 0)
            {
                prevLoc = location;
                location = location.getPointer();
            }
            else
                break;
        }
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);

        if (prevLoc == null) {
            newNode.setPointer(LLindexedList);
            LLindexedList = newNode;
        }
        else {
            newNode.setPointer(location);
            prevLoc.setPointer(newNode);
        }
        numElements++;
    }


    @Override
    public boolean contains(T element)
    // Returns true if an identical string already exists in the list, otherwise returns false.
    {
        find (element);
        return found;
    }

    @Override
    public T remove(T element)
    //Removes an existing element on the list if it is identical to the element passed into the method.
    {
        find(element);
        if (found) {
            if (LLindexedList == location)
                LLindexedList = LLindexedList.getPointer();
            else
                previous.setPointer(location.getPointer());
            numElements--;
        }
        return element;
    }

    @Override
    public T get(T element)
    //Returns an equivalent object on the list, if it exists.
    {
        find (element);
        if (found)
            return location.getElement();
        else
            return null;
    }

    @Override
    public void reset()
    //Sets the current position to the first element of the list.
    {
        currentPos = LLindexedList;
    }

    @Override
    public T getNext()
    //Returns the next element through iteration, and updates the current position.
    {
        T next = currentPos.getElement();
        if (currentPos.getPointer() == null)
            currentPos = LLindexedList;
        else
            currentPos = currentPos.getPointer();
        return next;
    }

    @Override
    public boolean isEmpty()
    //Returns true if this list is empty, otherwise returns false.
    {
        if (front == null)
            return true;
        else
            return false;
    }

    @Override
    String toString()
    //Returns a formatted string of the elements in this stack.
    {
        LinkedListNode<T> currNode = LLindexedList;
        String listString = "List:\n";
        while (currNode != null) {
            listString = listString + " " + currNode.getElement() + "\n";
            currNode = currNode.getPointer();
        }
        return listString;
    }



}
*/