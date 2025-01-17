public class LL3 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Adding node In First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Adding node in Last

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Deleting the First Node


    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already empty");
            return;
        }
        head = head.next;
    }


    // Deleting the last Node

    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head == null){
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        // Now we Have to travser the Node
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // Printing the list

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL3 l = new LL3();
        l.addFirst("Hello");
        l.addFirst("sharad");
        l.printList();
        l.deleteFirst();
        l.printList();
        l.addLast("Hello");
        l.addLast("Kumar");
        l.printList();
        l.deleteLast();
        l.printList();
    }
}
