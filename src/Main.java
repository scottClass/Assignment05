/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(10);
        
        list.remove(6);
        list.printList();
        
        System.out.println();
        System.out.println(list.get(2));
        
        if(!list.isEmpty()) {
            System.out.println();
            System.out.println(list.size());
        }
    }
}