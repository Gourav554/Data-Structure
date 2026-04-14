package Linkedlist;

public class Delete {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    // Insert at beginning
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }



    // Delete at First
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        head = head.next;
    }



    // Delete at Last
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null; // ✅ correct place
    }



    // Delete at Position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Out of bound");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Out of bound");
            return;
        }

        temp.next = temp.next.next; 
    }



    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }



    public static void main(String[] args) {

        Delete list = new Delete();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);

        list.printList();

        list.deleteAtFirst();
        list.printList();

        list.deleteAtLast();
        list.printList();

        list.deleteAtPosition(1);
        list.printList();
    }
}