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
        Node node = new Node(1);
        
        list.add(6);
        list.add(3);
        
          
        list.printList();
        System.out.println();
        
        if(list.isEmpty() == false) {
            System.out.println(list.size());
        }
    }
}