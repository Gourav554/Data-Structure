package Linkedlist;

public class Delete {

    Node head;
    class Node{
        int Data;
        Node next;
        

        Node(int data){
            this.Data = data;
            this.next = null;
        }
    }
    //Insert at begnning
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
  

    //Delete at First
        public void deleteAtFirst(){
            if(head == null){
                System.out.println("Linkedlist is Empty");
                return;
            }

            // head head ka next ho gaya hai
            head = head.next;
        }



      //Delete At Last
        public void deleteAtLast(){
            if(head == null){
                System.out.println("Empty");
              return;
            }
            if(head.next == null){
                head =null;
                return;
            }
             Node temp = head;

             while(temp.next.next !=null){
                temp = temp.next;
             temp.next = null; 
        }
        }
public void deleteAtPosition(int position){
    if(head == null){
        System.out.println("Empty");
        return;
    }
    if( position ==1){
        deleteAtFirst();
        return;
    }
     Node head = this.head;

        public static void main(String[] args) {
           

    }
    
}
