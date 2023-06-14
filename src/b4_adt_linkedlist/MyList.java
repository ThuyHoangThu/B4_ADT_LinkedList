/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_adt_linkedlist;

/**
 *
 * @author ADMIN
 */
public class MyList {
    //My List coi nhu 1 doan tau (bao gom cac Node, bao gom Head & Tail)
    Node head, tail;
    
    //constructor

    public MyList() {
        head = tail = null;
    }
    
    //phuong thuc kiem tra xem danh sach rong hay khong
    public boolean isEmpty() {
        return head == null;
    }
    
    //Them 1 phan tu vao dsach lien ket
    public void add(int x){
        //Khoi tao 1 phan tu
        Node g = new Node(x);
        if(isEmpty()){
            head = tail = g;
        }
        else{
            //Lay moc cua tail gan vao node moi
            //Gan tail = node moi
            tail.next = g;
            tail = g;
        }
    }
    
    //Them 1 mang vao danh sach/ them nhieu phan tu
    public void addMany(int[] a){
        //Duyet lan luot cac phan tu trong mang a va them tung phan tu
        for(int i:a){
            add(i);
        }
    }
    
    //Hien thi cac item trong list
    public void traverse(){
        // Dung 1 node lam con tro va tro tu head -> tail danh sach den khi node = null
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.info);
            currentNode = currentNode.next;
        }
    }
}
