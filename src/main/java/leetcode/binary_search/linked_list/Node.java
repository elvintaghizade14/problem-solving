package com.leetcode.linked_list;

public class Node<T> {
    private T val;
    private Node<T> next;

    public Node(final T val) {
        this.val = val;
    }

    public Node(final T val, final Node<T> next) {
        this.val = val;
        this.next = next;
    }

    public T getVal() {
        return this.val;
    }

    public void setVal(final T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(final Node<T> next) {
        this.next = next;
    }
}
