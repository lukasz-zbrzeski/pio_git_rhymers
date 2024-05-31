package edu.kis.vh.nursery.list;

/**
 * The {@code IntLinkedList} class implements a double-linked list structure for integer elements.
 * This class allows adding elements to the end of the list and provides access to, and removal of, the last added element.
 */
public class IntLinkedList {

    private static final int VALUE = -1;    // Constant representing the return value for an empty list
    private Node last;                      // The last node in the list
    private int i;

    /**
     * Adds a new element to the end of the list.
     * If the list is empty, the new element becomes both the first and last element.
     * Otherwise, it adds the element to the end and updates the pointers accordingly.
     *
     * @param i the value of the element to add
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }


    /**
     * Checks whether the list is empty.
     *
     * @return {@code true} if the list is empty, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Always returns {@code false}, as the list has no capacity limitations.
     *
     * @return {@code false}
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value of the last element in the list.
     * If the list is empty, returns the constant {@code VALUE}.
     *
     * @return the value of the last element or {@code VALUE} if the list is empty.
     */
    public int top() {
        if (isEmpty())
            return VALUE;
        return last.getValue();
    }

    /**
     * Removes and returns the last element from the list.
     * If the list is empty, returns the constant {@code VALUE}.
     *
     * @return the value of the removed element or {@code VALUE} if the list is empty.
     */
    public int pop() {
        if (isEmpty())
            return VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Inner class {@code Node} represents a single node in the double-linked list.
     * Each node stores a value and has references to the previous and next node in the list.
     */
    private class Node {

        private int value;    // The value stored in the node
        private Node prev;    // Reference to the previous node in the list
        private Node next;    // Reference to the next node in the list

        /**
         * Constructor that initializes the node with a given value.
         *
         * @param i the value to store in the node
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Returns the value stored in the node.
         *
         * @return the value of the node
         */
        public int getValue() {
            return value;
        }

        /**
         * Returns the reference to the previous node in the list.
         *
         * @return the previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the reference to the previous node in the list.
         *
         * @param prev the new previous node
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Returns the reference to the next node in the list.
         *
         * @return the next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Sets the reference to the next node in the list.
         *
         * @param next the new next node
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }

}
