/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class ResizeList {

    private Node head;
    private int numItems;
    private int[] array;
    private int count;
    private int length;

    /**
     * Creates an Empty List
     */
    public ResizeList() {
        head = null;
        numItems = 0;
        length = 10;
        array = new int[length];
        count = 0;
    }

    /**
     * Add the node to the beginning of the list
     *
     * @param n the node to add
     */
    public void add(Node n) {
        n.setNext(head);
        head = n;
        numItems++;
        count++;
    }

    /**
     * Adds a node at a specific index
     *
     * @param index the position to place the node
     * @param n the node to add
     */
    public void add(int index, Node n) {
        if(count == 10) {
            int[] temp = new int[length];
            for(int i = 0; i < temp.length; i++) {
                temp[i] = array[i];
            }
            array = new int[length + 10];
            for(int i = 0; i < temp.length; i ++) {
                array[i] = temp[i];
            }
        }
        array[count] = n.getNum();
        index = numItems;
        
        //System.out.println(index);
        // adding to an empty list        
        if (numItems == 0) {
            add(n);
        } else if (index == 0) {
            add(n);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            // set the node im adding's next node
            n.setNext(current.getNext());
            current.setNext(n);

            // we've added a number
            numItems++;
            count++;
        }

    }

    public void printList() {
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public void remove(int index) {
        //since it counts from zero this makes it so that the first item in the list is the 1st index 
        index -= 1;
        // make sure it is in our list
        if (index >= numItems || index < 0) {
            return;
        }
        // delete first item
        if (index == 0) {
            head = head.getNext();
            // deleting end item
        } else if (index == numItems - 1) {
            // go to the second last node
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            // make it point nowhere
            n.setNext(null);
            // remove from the middle
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            // ask the node for its next next node
            n.setNext(n.getNext().getNext());
        }
        numItems--;
    }

    public int get(int index) {
        Node n = head;
        for (int i = 0; i <= index; i++) {
            if (i == index - 1) {
                return n.getNum();
            } else {
                n = n.getNext();
            }
        }
        return 0;
    }
    
    public int size() {
        return numItems;
    }
}
