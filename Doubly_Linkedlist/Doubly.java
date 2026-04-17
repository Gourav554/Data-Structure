

public class Doubly {
    public static void main(String[] args) {
        class Node{
        int data;
        Node next;
        Node prev;


        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    class DoublyLinkedlist{
        Node head;

        //Add First Method
        public void addFirst(int data){
            Node newNode = new node(data);
            if(head==null){
                head = newNode;
                return;
            }
            //Link new Node withj Head
            newNode.next = head;
            head.prev = newNode;

            //Update Head to new Node

        }
    }
    }
}
