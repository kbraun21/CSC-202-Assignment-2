package utils.exceptions;

/**
 * Created by kristab21 on 7/10/16.
 */

public class StackOverflowException extends RuntimeException
{
    public StackOverflowException()
    {
        super();
    }

    public StackOverflowException(String message)
    {
        super (message);
    }
}
