/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        list.add(1,new Node(4));
        list.add(0, new Node(3));
        
        list.printList();
        
    }
}
