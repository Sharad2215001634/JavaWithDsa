public class ReverseLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
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

    public void reverseItrate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while(curNode != null){
            Node nextNode = curNode.next;
            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;


    }

    public void printList(){
        if(head == null){
            System.out.println("This is empty");
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
        ReverseLL l = new ReverseLL();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addLast(0);
        l.printList();
        l.reverseItrate();
        l.printList();
    }
}