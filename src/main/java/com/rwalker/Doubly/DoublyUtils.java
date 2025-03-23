package com.rwalker.Doubly;
import java.util.Comparator;

/**
 * Class that handles all utilities for a doubly linked list
 */

public class DoublyUtils {
    
    /**
     * Method to return a string representation of a doubly linked list
     * @param head the head of the list
     * @param nextMethod the method to call to get the next item
     * @return String representation of the list
     */
    public static String dString(Object head, String nextMethod) {

        try {

            StringBuilder sb = new StringBuilder();
            Object current =  head;
            while (current != null) {
                sb.append("'" + current.toString() + "'");
                sb.append(" -> ");
                current = current.getClass().getMethod(nextMethod).invoke(current);
            }
            sb.append("null");
            return sb.toString();

        } catch (Exception e) {
            return e.getMessage();
        }

    }

    /**
     * Method to remove an item from a doubly linked list
     * @param item the item to remove
     * @param nextGet the method to call to get the next item
     * @param previousGet the method to call to get the previous item
     * @param nextSet the method to call to set the next item
     * @param previousSet the method to call to set the previous item
     */
    public static void remove(Object item, String nextGet, String previousGet, String nextSet, String previousSet) {

        try {

            // Get the previous and next objects in the list
            Object next = item.getClass().getMethod(nextGet).invoke(item);
            Object previous = item.getClass().getMethod(previousGet).invoke(item);

            // Set previous to point to next and next to point to previous
            previous.getClass().getMethod(nextSet,  previous.getClass()).invoke(previous,next);
            next.getClass().getMethod(previousSet, next.getClass()).invoke(next,previous);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    /**
     * Method to get an item from a doubly linked list
     * @param head the head of the list
     * @param index the index of the item to get
     * @param nextGet the method to call to get the next item
     * @return the item at the index
     */
    public static Object get(Object head, int index, String nextGet) {

        try {

            Object current = head;

            for (int i = 0; i < index; i++) {
                current = current.getClass().getMethod(nextGet).invoke(current);
            }

            return current;

        } catch (Exception e) {

            return e.getMessage();

        }
    }

    public static <E> Object sort(E head, String nextGet, String nextSet, String previousGet, String previousSet, Comparator<E> comp) {

        // Method unimplemented

        return null;
    }
}
