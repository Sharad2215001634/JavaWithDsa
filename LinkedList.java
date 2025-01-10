public class LinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add First And Last

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {  // Corrected condition
            currNode = currNode.next;
        }

        currNode.next = newNode;  // Add new node at the end
    }

    // Print List

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");  // Added newline for cleaner output
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();  // Output should be: is -> a -> NULL
        list.addLast("List");
        list.printList();  // Output should be: is -> a -> List -> NULL

        list.addFirst("this");
        list.printList();  // Output should be: this -> is -> a -> List -> NULL
    }
}
