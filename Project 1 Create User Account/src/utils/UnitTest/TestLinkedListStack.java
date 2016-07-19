package utils.UnitTest;

import org.junit.Before;
import org.junit.Test;
import utils.stack.LinkedListStack;

import static org.junit.Assert.*;

/**
 * Created by kristab21 on 7/11/16.
 */

public class TestLinkedListStack {
    LinkedListStack<String> nameStack = new LinkedListStack<String>();
    String expectedPushResult = "David Cathy Bobby Andrew";
    String expectedPopResult = "Cathy\tBobby\tAndrew\t" ;
    String expectedTopResult = "David";
    int expectedSizeResult = 4;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void top() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        assertEquals("Top must contain \"David\"", expectedTopResult, (String)nameStack.top());
    }

    @Test
    public void pop() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        System.out.println(nameStack.pop());
        System.out.println(nameStack);
        assertEquals("After pop, the stack must contain \"Cathy\tBobby\tAndrew\t", expectedPopResult, nameStack.toString());
    }

    @Test
    public void push() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        assertEquals("Stack must contain \"David\tCathy\tBobby\tAndrew\t", expectedPushResult, nameStack.toString());
    }

    @Test
    public void size() throws Exception {
        nameStack.push("Andrew");
        nameStack.push("Bobby");
        nameStack.push("Cathy");
        nameStack.push("David");
        assertEquals("Stack size must be 4.", expectedSizeResult, nameStack.size()) ;
    }

    @Test
    public void isEmpty() throws Exception {

    }

  /*  public static void main(String[] args) {
        LinkedListStack<String> nameStack = new LinkedListStack<String>();
        nameStack.push("Name 1");
        nameStack.push("Name 2");
        System.out.println(nameStack);
    } */
}
