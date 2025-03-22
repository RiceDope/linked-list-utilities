package com.rwalker;

import com.rwalker.Doubly.*;

public class Main {
    
    public static void main (String[] args)  {

        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        for (int i = 0; i <  10; i++ ) {
            list.add("Item " + i);
        }

        System.out.println(list);
        list.remove(5);
        System.out.println(list);

    }

}
