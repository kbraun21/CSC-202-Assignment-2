package utils.lists;

import utils.lists.IList;
import utils.queue.ILinkedListQueue;
import utils.stack.LinkedListNode;

/**
 * Created by kristab21 on 7/10/16.
 */

public class LinkedListOrderedList<T> implements IList<T>  {

    protected int numElements;
    protected LinkedListNode<T> currentPos;

    protected boolean found;
    protected LinkedListNode<T> location;
    protected LinkedListNode<T> previous;
    protected LinkedListNode<T> LLOrderedList;


    public LinkedListOrderedList() {
        numElements = 0;
        LLOrderedList = null;
        currentPos = null;
    }


    protected void find(T target) {
        location = LLOrderedList;
        found = false;

        while(location != null)
        {
            if (location.getElement().equals(target))
            {
                found = true;
                return;
            } else {
                previous = location ;
                location = location.getPointer();
            }
        }
    }

    @Override
    public void add(T element)
    //Adds elements to the list.
    {
        LinkedListNode<T> prevLoc;
        LinkedListNode<T> location;
        T listElement;

        location = LLOrderedList;
        prevLoc = null;

        while (location != null) {
            listElement = location.getElement();
            if (((Comparable) listElement).compareTo(element) < 0) {
                prevLoc = location;
                location = location.getPointer();
            }
            else
                break;
        }
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);

        if (prevLoc == null) {
            newNode.setPointer(LLOrderedList);
            LLOrderedList = newNode;
        }
        else {
            newNode.setPointer(location);
            prevLoc.setPointer(newNode);
        }
        numElements++;
    }

    @Override
    public T remove(T element)
    //Removes and returns an existing element on the list if it is identical to the element passed into the method.
    {
        find(element);
        if(found) {
            if (LLOrderedList == location)
                LLOrderedList = LLOrderedList.getPointer();
            else
                previous.setPointer(location.getPointer());
            numElements--;
        }
        return element;
    }

    @Override
    public boolean contains(T element)
    // Returns true if an identical string already exists in the list, otherwise returns false.
    {
        find(element);
        return found;
    }

    @Override
    public boolean isEmpty()
    //Returns true if this list is empty, otherwise returns false.
    {
        return (numElements == 0);
    }

    @Override
    public int size()
    // returns the number of strings in the list.
    {
        return numElements;
    }

    @Override
    public T get(T element)
    //Returns an equivalent object on the list, if it exists.
    {
        find(element);
        if (found)
            return location.getElement();
        else
            return null;
    }

    @Override
    public void reset()
    //Sets the current position to the first element of the list.
    {
        currentPos = LLOrderedList;
    }

    @Override
    public T getNext()
    //Returns the next element through iteration, and updates the current position.
    {
        T next = currentPos.getElement();
        if (currentPos.getPointer() == null)
            currentPos = LLOrderedList;
        else
            currentPos = currentPos.getPointer();
        return next;
    }

    public String toString()
    //Returns a formatted string of the elements in this stack.
    {
        LinkedListNode<T> currNode = LLOrderedList;
        String LLOrderedListString ="List:\n";
        while (currNode != null) {
            LLOrderedListString = LLOrderedListString + " " + currNode.getElement() + "\n";
            currNode = currNode.getPointer();
        }
        return LLOrderedListString;
    }

}
