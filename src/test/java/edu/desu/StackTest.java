package edu.desu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    @Test
    void givenEmptyStack_whenPush_thenSizeShouldBeOne() {
        // Given: an empty stack
        assertTrue(stack.isEmpty());

        // When: we push an element
        stack.push(1);

        // Then: the size should be one
        assertEquals(1, stack.size());
    }

    @Test
    void givenStackWithOneElement_whenPop_thenStackShouldBeEmpty() {
        // Given: a stack with one element
        stack.push(1);

        // When: we pop the element
        stack.pop();

        // Then: the stack should be empty
        assertTrue(stack.isEmpty());
    }

    @Test
    void givenStackWithElements_whenPeek_thenCorrectElementShouldBeReturned() {
        // Given: a stack with some elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // When: we peek the top element
        int topElement = stack.peek();

        // Then: the correct element should be returned
        assertEquals(3, topElement);
    }

    @Test
    void givenEmptyStack_whenIsEmpty_thenTrueShouldBeReturned() {
        // Given: an empty stack
        // When: checking if it's empty
        // Then: true should be returned
        assertTrue(stack.isEmpty());
    }

    @Test
    void givenStackWithElements_whenSize_thenCorrectSizeShouldBeReturned() {
        // Given: a stack with some elements
        stack.push(1);
        stack.push(2);

        // When: getting its size
        int size = stack.size();

        // Then: the correct size should be returned
        assertEquals(2, size);
    }

    @Test
    void givenEmptyStack_whenPop_thenExceptionShouldBeThrown() {
        // Given: an empty stack
        // When: popping an element
        // Then: an exception should be thrown
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void givenEmptyStack_whenPeek_thenExceptionShouldBeThrown() {
        // Given: an empty stack
        // When: peeking the top element
        // Then: an exception should be thrown
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }
}
