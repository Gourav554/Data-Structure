package Linkedlist;

public class Search {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
Node head = null;

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }


    //Search at node
    public void search (int key){
        Node temp = head;
        int position = 1;

        while(temp != null){
            if(temp.data == key){
                System.out.println("Element found at position: " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Element not found in the list.");

    }



    public
    }
    
}
