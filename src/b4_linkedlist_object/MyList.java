/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_linkedlist_object;

/**
 *
 * @author ADMIN
 */
public class MyList {
    //My List coi nhu 1 doan tau (bao gom cac Node, bao gom Head & Tail)
    private Node head;
    private Node tail;
    
    //constructor

    public MyList() {
        head = tail = null;
    }
    
    //phuong thuc kiem tra xem danh sach rong hay khong
    public boolean isEmpty() {
        return head == null;
    }
    
    //Them 1 phan tu vao dsach lien ket
    public void add(Node node){
       
        if(isEmpty()){
            head = tail = node;
        }
        else{
            //Lay moc cua tail gan vao node moi
            //Gan tail = node moi
            tail.next = node;
            tail = node;
        }
    }
    
    //Them 1 item vao vi tri dau trong danh sach
    public void addFirst(Node node) {
        
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    
    //Them 1 item vao vi tri cho truoc trong danh sach
    public void addAt(int position, Node node){
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            Node previousNode = head;
            int count = 1;
            while (count < position - 1 && previousNode.next != null) {
                previousNode = previousNode.next;
                count++;
            }
            node.next = previousNode.next;
            previousNode.next = node;
        }
    }
   
    //Xoa item dau tien trong danh sach
    public void DeleteFirst(){
        if (head == null){
            return;
        }
        
        head = head.next;
    }
    
    //Xoa item cuoi cung trong danh sach
    public void DeleteLast(){
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
        
    }
    
    //Xoa item tai position
    public void DeleteAt(int position){
        if (head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        int count = 1;
        while (currentNode != null && count < position) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        if (currentNode == null) {
            return;
        }
        previousNode.next = currentNode.next;
    }
    //Hien thi cac item trong list
    public void traverse(){
        // Dung 1 node lam con tro va tro tu head -> tail danh sach den khi node = null
        Node currentNode = head;
        while(currentNode != null){
            currentNode.printData();
            currentNode = currentNode.next;
        }
    }

    
}
