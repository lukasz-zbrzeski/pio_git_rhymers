package edu.kis.vh.nursery.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntLinkedListTest {

    private IntLinkedList list;

    @Before
    public void setUp() {
        list = new IntLinkedList();
    }

    @Test
    public void testEmptyListShouldBeEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void testNonEmptyListShouldNotBeEmpty() {
        list.push(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testPushAndTop() {
        list.push(1);
        assertEquals(1, list.top());
        list.push(2);
        assertEquals(2, list.top());
    }

    @Test
    public void testPushAndPop() {
        list.push(1);
        list.push(2);
        assertEquals(2, list.pop());
        assertEquals(1, list.pop());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testPopEmptyList() {
        assertEquals(-1, list.pop());
    }

    @Test
    public void testTopEmptyList() {
        assertEquals(-1, list.top());
    }

    @Test
    public void testIsFull() {
        assertFalse(list.isFull());
        list.push(1);
        assertFalse(list.isFull());
    }
}
