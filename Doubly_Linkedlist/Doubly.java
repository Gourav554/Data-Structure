public class Doubly {

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

    class DoublyLinkedlist {
        Node head;

        // Add First Method
        public void addFirst(int data) {
            Node newNode = new Node(data); 

            if (head == null) {
                head = newNode;
                return;
            }

            // Link new node with head
            newNode.next = head;
            head.prev = newNode;

            // Update head
            head = newNode;
        }

        // Print
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Doubly obj = new Doubly(); // outer class ka object
        DoublyLinkedlist dll = obj.new DoublyLinkedlist(); // inner class ka object

        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);

        dll.printList();
    }
}