/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamonta
 */
public class OrderedList {

    private Node filler = new Node(-100);
    private Node head;
    private Node remove = filler;
    private int numItems;
    private int index;

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
        //adds node to list
        add(n);

        //keeps log of how many numbers are added
        numItems++;
        index++;
    }

    /**
     * Prints all the numbers currently in the list
     */
    public void printList() {
        Node n = head;

        for (int i = 0; i <= index - 1; i++) {
            //doesn't print number if it's a number we want to remove
            if (remove.getNum() != n.getNum()) {
                System.out.println(n.getNum());
            }
            //gets next node
            n = n.getNext();
        }
    }

    /**
     * marks a number for deletion
     * @param num number to delete
     */
    public void remove(int num) {
        Node n = new Node(num);
        remove = n;

        numItems--;
    }

    /**
     * Returns number in the position given
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
