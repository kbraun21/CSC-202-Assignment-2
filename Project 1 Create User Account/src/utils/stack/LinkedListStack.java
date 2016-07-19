package utils.stack;

import utils.exceptions.StackUnderflowException;
import org.junit.Test;

/**
 * Created by kristab21 on 7/6/16.
 */


public class LinkedListStack<T> implements ILinkedListStack<T> {

    private LinkedListNode<T> top; //top of this stack
    private int numElement = 0;

   public LinkedListStack() {
        top = null;
    }

    @Override
    public T top() throws StackUnderflowException
    //Returns the top element of the stack, if the stack is empty throws Stack Underflow Exception.
    {
        if (!isEmpty())
            return top.getElement();
        else
            throw new StackUnderflowException("Top attempted on an empty stack.");
    }

    @Override
    public T pop() throws StackUnderflowException
    // Removes the top element of the stack, if the stack is empty throws Stack Underflow Exception.
    {
        if (isEmpty()) {
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        }
        T element = top.getElement();
        top = top.getPointer();
        return element;
    }

    @Override
    @Test
    public void push(T element)
    //Adds an element to the top of the stack.
    {
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);
        newNode.setPointer(top);
        top = newNode;
        numElement++;
    }

    @Override
    public boolean isEmpty()
    //Returns true if this list is empty, otherwise returns false.
    {
        return (numElement == 0);
    }

    @Override
    public int size()
    // returns the number of strings in the list.
    {
        return numElement;
    }

    public String toString ()
    //Returns a formatted string of the elements in this stack.
    {
        LinkedListNode<T> current = top;
        String list  = "";
        while (current != null) {
          list += current.getElement() + "\t";
            current = current.getPointer();

        }
        return list;
    }


}
