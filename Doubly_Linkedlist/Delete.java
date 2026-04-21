import java.util.*;

public class Delete {
    
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    //Delete first node
     public void deleteFirst() {

        // Case 1: Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        // Case 3: More than one node
        head = head.next;
        head.prev = null;
    }

    //Delete at Last
     public void deleteLast() {

        // Case 1: Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.prev.next = null;
        temp.prev = null; // optional (helps GC)
    }

  public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Delete dll = new Delete();

        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);

        System.out.println("Original list:");
        dll.display();  

        dll.deleteFirst();
        System.out.println("After deleting first node:");
        dll.display();  

        dll.deleteLast();
        System.out.println("After deleting last node:");
        dll.display();  

    }
}
