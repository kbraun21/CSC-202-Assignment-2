package utils.stack;

/**
 * Created by kristab21 on 7/6/16.
 */


public class LinkedListNode <T> {

    private T element;
    LinkedListNode pointer;

    public LinkedListNode(T element) {
        this.element = element;
        this.pointer = null;
    }

    public LinkedListNode(T element, LinkedListNode pointer) {
        this.element = element;
        this.pointer = pointer;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public LinkedListNode getPointer() {
        return pointer;
    }

    public void setPointer(LinkedListNode pointer) {
        this.pointer = pointer;
    }
}
