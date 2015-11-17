/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott
 */
public class Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResizeList list = new ResizeList();
        
        list.add(0, new Node(1));
        list.add(1, new Node(4));
        list.add(1, new Node(2));
        list.remove(0);
        list.printList();
        
        
    }
    
}
