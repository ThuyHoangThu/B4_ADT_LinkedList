/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b4_adt_linkedlist;

/**
 *
 * @author ADMIN
 */
public class B4_ADT_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList ml = new MyList();
        ml.add(1);
        ml.add(43);
        ml.add(5);
        ml.add(8);
        int[] a = {2,4,7,8};
        ml.addMany(a);
        ml.traverse();
    }
    
}
