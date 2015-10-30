/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamonta
 */
public class OrderedList {

    private Node head;
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
        numItems++;
    }

    /**
     * Adds a node at a specific index
     *
     * @param index the position to place the node
     * @param n the node to add
     */
//    public void add(int index, Node n) {
//        // adding to an empty list
//        if (numItems == 0) {
//            add(n);
//        } else if (index == 0) {
//            add(n);
//        } else {
//            Node current = head;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.getNext();
//            }
//            // set the node im adding's next node
//            n.setNext(current.getNext());
//            current.setNext(n);
//
//            // we've added a number
//            numItems++;
//        }
//
//    }
    
    public void add(int num) {
         //adding to an empty list
        Node n = new Node(num);
        index = 0;
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
            index ++;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.getNum());
            n = n.getNext();
        }
    }

    public void remove(int n) {
        Node o = new Node(n);
        for(int i = 0; i < index; i++) {
            
        }
        
    }

    public int getInt(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n.getNum();
    }
    
    public int size() {
        return numItems;
    }
    
    public boolean isEmpty() {
        if(numItems == 0) {
            return true;
        } else {
            return false;
        }
        
    }
}
