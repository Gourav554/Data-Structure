import java.util.*;
class Inser{

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

    // Insert at last
    public void addLast(int data) {
        Node newNode = new Node(data);

        // Case 1: Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node with new node
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dill.addLast(5);

        dll.display();  // Output: 10 <-> 20 <-> 30 <-> null
    }
}