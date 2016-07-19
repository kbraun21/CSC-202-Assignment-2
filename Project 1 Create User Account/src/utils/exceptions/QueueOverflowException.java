package utils.exceptions;

/**
 * Created by kristab21 on 7/10/16.
 */

public class QueueOverflowException extends RuntimeException {

    public QueueOverflowException()
    {
        super();
    }

    public QueueOverflowException(String message)
    {
        super (message);
    }

}
