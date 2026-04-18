import org.w3c.dom.Node;

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
    }

