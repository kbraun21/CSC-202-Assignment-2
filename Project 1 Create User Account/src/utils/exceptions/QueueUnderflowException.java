package utils.exceptions;

/**
 * Created by kristab21 on 7/10/16.
 */


public class QueueUnderflowException extends RuntimeException {
    public QueueUnderflowException() {
        super();
    }

    public QueueUnderflowException(String message) {
        super(message);
    }

}
