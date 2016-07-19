package utils.lists;

import utils.exceptions.IndexOutOfBoundsException;

/**
 * Created by kristab21 on 7/11/16.
 */

 public class ArrayIndexedList<T> implements IListIndexed<T> {

    private final int DEFCAP = 100; //default capacity
    private T indexedList[]; //array that holds queue elements
    private int numElements = 0; //number of elements in the queue
    private int origSize; //original capacity
    private int currentPos;

    protected boolean found;
    protected int location;

    public ArrayIndexedList() {
        indexedList = (T[]) new Object[DEFCAP];
        origSize = DEFCAP;
    }

    public ArrayIndexedList(int size) {
        indexedList = (T[]) new Object[size];
        origSize = size;
    }

    @Override
    public void add(int index, T element)
    //Adds elements to the list, throws Index out of bounds exception if the index < 0 or index > size()
    {
        if ((index < 0) || (index > size()))
            throw new IndexOutOfBoundsException("illegal index of" + index + " passed to ArrayIndexedList add method.\n");
        if (numElements == indexedList.length)
            enlarge();
        for (int i = numElements; i > index; i--)
            indexedList[i] = indexedList[i - 1];
        indexedList[index] = element;
        numElements++;
    }

    @Override
    public T set(int index, T element) throws IndexOutOfBoundsException
    //Replaces and returns element on list at given index with new given element.
    //Throws Index out of bounds exception if the index < 0 or index > size().
    {
        if ((index < 0) || (index >= size()))
            throw new IndexOutOfBoundsException("illegal index of" + index + " passed to ArrayIndexedList set method.\n");
        T hold = indexedList[index];
        indexedList[index] = element;
        return hold;
    }

    @Override
    public T get(int index)
    //Returns the element on the list at given index.
    //Throws index out of bounds exception if index < 0 or index > size().
    {
        if ((index < 0) || (index >= size()))
            throw new IndexOutOfBoundsException("illegal index of" + index + " passed to ArrayIndexedList get method.\n");
        return indexedList[index];
    }

    @Override
    public int indexOf(T element)
    //If the list contains an element that equals the given element, it returns the index of the first occurrence.
    //Otherwise returns -1.
    {
        find(element);
        if (found)
            return location;
        else
            return -1;
    }

    @Override
    public T remove(int index)
    //Removes and returns the existing element on the list at the given index.
    //Each element at higher positions have their index decreased by 1.
    //Throws index out of bounds exception if index < 0 or index > size().
    {
        if ((index < 0) || (index >= size()))
            throw new IndexOutOfBoundsException("illegal index of" + index + " passed to ArrayIndexedList remove method.\n");
        T hold = indexedList[index];

        for (int i = index; i < (numElements - 1); i++)
            indexedList[i] = indexedList[i + 1];

        indexedList[numElements - 1] = null;
        numElements--;
        return hold;
    }

    @Override
    public int size()
    // returns the number of strings in the array
    {
        return numElements;
    }

    @Override
    public void add(T element) {
        int location = 0;
        T item;

        //check if array is full
        if (indexedList.length == size()) {
            enlarge();
        }
        //search for location to insert the new element
        for (int i = location; i < size(); i++) {
            item = indexedList[location];
            if (((Comparable) item).compareTo(element) < 0) {
                location++;
            } else {
                break;
            }
        }
        //shifting
        for (int i = numElements; i > location; i--) {
            indexedList[i] = indexedList[i - 1];
        }
        indexedList[location] = element;
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
                indexedList[i] = indexedList[i + 1];
            indexedList[numElements - 1] = null;
            numElements--;
        }
        return element;
    }

    @Override
    public T get(T element)
    //Returns the location of an element that equals the one passed into the method if one exists, otherwise returns false.
    //Throws index out of bounds exception if index < 0 or index > size().
    {
        find(element);
        if (found)
            return indexedList[location];
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
        T next = indexedList[currentPos];
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
        for (int i = 0; i < indexedList.length; i++) {
            largerList[i] = indexedList[i];
        }
        indexedList = largerList;
    }

    protected void find(T target) {
        location = 0;
        found = false;

        while (location > numElements) {
            if (indexedList[location].equals(target))
            {
                found = true;
                return;
            } else
                location++;
        }
    }

    public String toString()
    //Returns a formatted string of the elements in this array.
    {
        String indexedListString = "List: \n";
        for (int i = 0; i < numElements; i++)
            indexedListString = indexedListString + " [" + i + "] " + indexedList[i] + "\n";
        return indexedListString;
    }


}

