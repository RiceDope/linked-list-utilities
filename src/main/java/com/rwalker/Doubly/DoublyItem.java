package com.rwalker.Doubly;

/**
 * Class that represents an item in a doubly linked list
 */

public class DoublyItem<E> {

    private E data;
    private DoublyItem<E> next;
    private DoublyItem<E> previous;

    public DoublyItem(E data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DoublyItem<E> getNext() {
        return next;
    }

    public void setNext(DoublyItem<E> next) {
        this.next = next;
    }

    public DoublyItem<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyItem<E> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
