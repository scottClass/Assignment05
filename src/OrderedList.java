/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class OrderedList {

    private Node head;
    private int numItems;

    /**
     * Creates an Empty List
     */
    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     * Add the node to the beginning of the list
     *
     * @param n the node to add
     */
    public void add(Node n) {
        n.setNext(head);
        if (head != null) {
            head.setPrev(n);
        }
        head = n;
    }

    /**
     * Adds number to the list
     *
     * @param num number to add
     */
    public void add(int num) {
        //converts num to node 
        Node n = new Node(num);
        //adds node to the start of the list
        if (isEmpty() || num < head.getNum()) {
            add(n);
        } else {
            Node current = head;
            boolean added = false;
            for (int i = 0; i < numItems - 1; i++) {
                //if the last number is smaller than the current number 
                //and the next number is bigger add the number between them
                if (current.getNum() <= num && current.getNext().getNum() >= num) {
                    n.setPrev(current);
                    n.setNext(current.getNext());
                    current.setNext(n);
                    n.getNext().setPrev(n);
                    added = true;
                    break;
                }
                //gets next node
                current = current.getNext();
            }
            //if the node has not been added it goes on the end
            if (!added) {
                current.setNext(n);
                n.setPrev(current);
            }
        }
        //keeps log of how many numbers are added
        numItems++;
    }

    /**
     * Prints all the numbers currently in the list
     */
    public void printList() {
        Node n = head;

        for (int i = 0; i < numItems; i++) {
            System.out.println(n.getNum());

            //gets next node
            n = n.getNext();
        }
    }

    /**
     * marks a number for deletion
     *
     * @param num number to delete
     */
    public void remove(int num) {
        Node n = new Node(num);
        Node current = head;
        for (int i = 0; i < numItems; i++) {
            //if the current number is the number that is to be removed
            if (current.getNum() == num) {
                //set the surrounding nodes past the node to be removed
                current.getNext().setPrev(current.getPrev());
                current.getPrev().setNext(current.getNext());
            }
            //gets next node
            current = current.getNext();
        }

        numItems--;
    }

    /**
     * Returns number in the position given
     *
     * @param index position in list to search
     * @return the number in index's position
     */
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

    /**
     *
     * @return the size of the list
     */
    public int size() {
        return numItems;
    }

    /**
     * Figures out if list is empty or not
     *
     * @return if list is empty
     */
    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }

    }
}
