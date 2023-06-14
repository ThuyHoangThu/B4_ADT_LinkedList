/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_linkedlist_object;

        
/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();
        Student s1 = new Student(12, "Minh", 19);
        Student s2 = new Student(1,"Chuis", 20);
        Student s3 = new Student(3,"Mulie",21);
        Student s4 = new Student(4,"NM",20);
        Node node1 = new Node(s1);
        Node node2  = new Node(s2);
        Node node3 = new Node(s3);
        Node node4 = new Node(s4);
        ml.add(node1);
        ml.add(node2);
        ml.add(node3);
        ml.addAt(2, node4);
        ml.traverse();
        ml.DeleteFirst();
        ml.DeleteAt(2);
        System.out.println("after deleting");
        ml.traverse();
    }
    
    
}
