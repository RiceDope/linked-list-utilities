package com.rwalker.Doubly;

/**
 * Class that handles the representation of a doubly linked list
 * @param <E> the type of data to be held
 */

public class DoublyLinkedList<E> {
    
    private DoublyItem<E> head;
    private DoublyItem<E> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(E data) {
        DoublyItem<E> item = new DoublyItem<>(data);
        if (head == null) {
            head = item;
            tail = item;
        } else {
            tail.setNext(item);
            item.setPrevious(tail);
            tail = item;
        }
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return ((DoublyItem<E>) DoublyUtils.get(head, index, "getNext")).getData();
    }

    public String toString() {
        return DoublyUtils.dString(head, "getNext");
    }

    @SuppressWarnings("unchecked")
    public void remove(int index) {
        DoublyItem<E> item = (DoublyItem<E>) DoublyUtils.get(head, index, "getNext");
        DoublyUtils.remove(item, "getNext", "getPrevious", "setNext", "setPrevious");
    }

}
