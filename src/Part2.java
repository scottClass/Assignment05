
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        int length = 10;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            
            array[i] = input.nextInt();
            
            if (array[i] == 0) {
                System.out.println();
                System.out.println("list:");
                list.printList();
                i = array.length;
            } else {
                list.add(0, new Node(array[i]));
                if (i + 1 == array.length) {
                    length += 10;
                    array = new int[length];
                }
            }
        }

    }

}
