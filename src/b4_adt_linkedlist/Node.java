/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_adt_linkedlist;

/**
 *
 * @author ADMIN
 */
public class Node {
    //Coi 1 node nhu 1 toa tau, gom 2 part info & next
    int info;
    Node next;    
    //constructor 

    public Node(int info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(int info) {
        this.info = info;
    } 
}
