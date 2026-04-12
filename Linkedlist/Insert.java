package Linkedlist;

public class Insert {

    class Node{
          Node head = null;

          // Inser at the Begnning
          public void insertAtBegnning(int data){
            Node newNode = new Node(data);
              if(head==null){
                head = node;
                return;
              }
                newNode.next = head.next;
                head = newNode;

          }


//Insert at last
public void insertAtlast(int data){

    Node newNode = new Node(data);
      if(head==null){
        head = newNode;
        return;
      }
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newNode;
}



//Insert in a Specific Position
public void userAtPosition(int data, int Position
    Node newNode = new Node(data);
    if(Position ==2){
        newNode.next  head;
 
    }
)
 public static void main(String[] args) {
    

 }   
}
