/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamonta
 */
public class OrderedList {
    private Node filler = new Node(-1);
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
        numItems++;
        n.setNext(head);
        head = n;

    }

    /**
     * Adds number to the list
     *
     * @param num number to add
     */
    public void add(int num) {
            //adding to an empty list
            Node n = new Node(num);
                add(n);
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.getNext();
                }
                // set the node im adding's next node
                n.setNext(current.getNext());
                current.setNext(n);

                // we've added a number
                numItems++;
                index++;
            }
        
    

    public void printList() {
        Node n = head;
        
        //doesn't print number if it's a number we want to remove
        for(int i = 0; i <= index - 1; i++) {
            if(remove.getNum() != n.getNum()) {
                System.out.println(n.getNum());
            }
            
            n = n.getNext();
        }
    }

    public void remove(int num) {
        Node n = new Node(num);
        remove = n;
        
        numItems--;
    }

    public int get(int index) {
        Node n = head;
        for (int i = 0; i <= index; i++) {
            if(i == index - 1) {
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

    public boolean isEmpty() {
        if (numItems == 0) {
            return true;
        } else {
            return false;
        }

    }
}
