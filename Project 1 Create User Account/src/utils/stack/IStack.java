package utils.stack;

import utils.exceptions.StackUnderflowException;

/**
 * Created by kristab21 on 7/6/16.
 */


public interface IStack <T> {

    T top() throws StackUnderflowException;
    T pop() throws StackUnderflowException;
    boolean isEmpty();
    int size();

}


    /* should go in main program - application level

    try
    {
        myObject = IStack.top();
        IStack.pop();
        myOtherObject = IStack.top();
        IStack.pop();
    }

    catch (StackUnderflowException underflow)
    {
        System.out.println("Exception" + underflow.getMessage());
        System.exit(1);
    } */
