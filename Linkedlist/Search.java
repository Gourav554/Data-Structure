package Linkedlist;

public class Search {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }




    // Search element (returns position)
    public void searchAtPosition(int key) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Element not found in the list.");
    }




    // Print list (optional)
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }



    
    public static void main(String[] args) {
        Search list = new Search(); // ✅ correct class name

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.printList();

        list.searchAtPosition(20);
    }
}