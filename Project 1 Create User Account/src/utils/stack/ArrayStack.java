package utils.stack;

import utils.exceptions.StackOverflowException;
import utils.exceptions.StackUnderflowException;

/**
 * Created by kristab21 on 7/6/16.
 */

public class ArrayStack<T> implements IArrayStack<T> {

    protected final int DEFCAP = 100; //default capacity
    protected T[] stack;  //holds stack elements
    protected int topIndex = -1; //index of top element in stack

    public ArrayStack() {
        stack = (T[]) new Object[DEFCAP];
    }

    public ArrayStack(int maxSize) {
        stack = (T[]) new Object[maxSize];
    }

        @Override
        public boolean isFull ()
        //Returns true if this array is full, otherwise returns false.
        {
            if (topIndex == (stack.length - 1) )
                return true;
            else
                return false;
        }

        @Override
        public boolean isEmpty ()
        //Returns true if this array is empty, otherwise returns false.
        {
            if (topIndex == -1)
                return true;
            else
                return false;
        }

        @Override
        public T top () throws StackUnderflowException
        //Returns the top element of the stack, if the stack is empty throws Stack Underflow Exception.
        {
            T topOfStack = null;
            if (!isEmpty())
                topOfStack = stack[topIndex];
            else
                throw new StackUnderflowException("Top attempted on an empty stack.");
            return topOfStack;
        }

        @Override
        public T pop () throws StackUnderflowException
        //Removes the top element of the stack, if the stack is empty throws Stack Underflow Exception.
        {
            if (!isEmpty()) {
                stack[topIndex] = null;
                topIndex--;
            }
            else
                throw new StackUnderflowException("Pop attempted on an empty stack");
            return pop();
        }

        @Override
        public void push (T element) throws StackOverflowException
        //Adds an element to the top of the stack, if the stack is full throws Stack Overflow Exception.
        {
            if (!isFull()) {
                topIndex++;
                stack[topIndex] = element;
            }
            else
                throw new StackOverflowException("Push attempted on full stack.");

        }

        @Override
        public int size()
        // returns the number of strings in the array
        {
            return size();
        }




    }

