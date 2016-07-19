package utils.exceptions;

/**
 * Created by kristab21 on 7/10/16.
 */

public class StackUnderflowException extends Exception {

    public StackUnderflowException()
    {
        super();
    }

    public StackUnderflowException(String message)
    {
        super(message);
    }
}
