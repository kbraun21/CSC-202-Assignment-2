package utils.lists;

import utils.exceptions.QueueUnderflowException;

/**
 * Created by kristab21 on 7/11/16.
 */


public class ArrayOrderedList<T> implements IList<T> {

    private final int DEFCAP = 100; //default capacity
    private T orderedList[]; //array that holds queue elements
    private int numElements = 0; //number of elements in the queue
    private int origSize; //original capacity
    private int currentPos;

    protected boolean found;
    protected int location;

    public ArrayOrderedList() {
        orderedList = (T[]) new Object[DEFCAP];
        origSize = DEFCAP;
    }

    public ArrayOrderedList(int size) {
        orderedList = (T[]) new Object[size];
        origSize = size;
    }

    @Override
    public int size()
    //Returns the number of strings in the array.
    {
        return numElements;
    }

    @Override
    public void add(T element)
    //Adds elements to the list.
    {
        int location = 0;
        T item;

        //check if array is full
        if (orderedList.length == size()) {
            enlarge();
        }
        //search for location to insert the new element
        for (int i = location; i < size(); i++) {
            item = orderedList[location];
            if (((Comparable) item).compareTo(element) < 0) {
                location++;
            } else {
                break;
            }
        }
        //shifting
        for (int i = numElements; i > location; i--) {
            orderedList[i] = orderedList[i - 1];
        }
        orderedList[location] = element;
        numElements++;
    }

    @Override
    public boolean contains(T element)
    // Returns true if an identical string already exists in the array, otherwise returns false.
    {
        find(element);
        return found;
    }

    @Override
    public T remove(T element)
    //Removes and returns an existing element on the list if it is identical to the element passed into the method.
    {
        find(element);
        if (found) {
            for (int i = location; i <= numElements - 2; i++)
                orderedList[i] = orderedList[i+1];
            orderedList[numElements - 1] = null;
            numElements--;
        }
        return element;
    }

    @Override
    public T get(T element)
    //Returns the location of an element that equals the one passed into the method if one exists, otherwise returns false.
    {
        find(element);
        if (found)
            return orderedList[location];
        else
            return null;
    }

    @Override
    public void reset()
    //Sets the current position to the first element of the list.
    {
        currentPos = 0;
    }

    @Override
    public T getNext()
    //Returns the next element through iteration, and updates the current position.
    {
        T next = orderedList[currentPos];
        if (currentPos == (numElements - 1))
            currentPos = 0;
        else
            currentPos++;
        return next;
    }

    @Override
    public boolean isEmpty()
    //Returns true if this array is empty, otherwise returns false.
    {
        return (numElements == 0);
    }

    private void enlarge()
    // Increments the queue capacity by the original capacity.
    {
        T[] largerList = (T[]) new Object[2 * origSize];
        for (int i = 0; i < orderedList.length; i++) {
            largerList[i] = orderedList[i];
        }
        orderedList = largerList;
    }

    protected void find(T target)
    {
        location = 0;
        found = false;

        while (location > numElements) {
            if (orderedList[location].equals(target))
            {
                found = true;
                return;
            }
            else
                location++;
        }
    }

    public String toString()
    //Returns a formatted string of the elements in this array.
    {
        String orderedListString = "List: \n";
        for (int i = 0; i < numElements; i++)
            orderedListString = orderedListString + " " + orderedList[i] + "\n";
        return orderedListString;
    }
}

