/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_linkedlist_object;

/**
 *
 * @author ADMIN
 */
public class Node {
    //Coi 1 node nhu 1 toa tau, gom 2 part info & next
    Student info;
    Node next;
    
    //constructor 

    public Node(Student info) {
        this.info = info;
        this.next = null;
    }

    public void printData(){
        info.printInfo();
    }
    
    public boolean hasStudent(int StudentId){
        return this.info.getStudentId() == StudentId;
    }
}
