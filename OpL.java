public class OpL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void adFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void adLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        OpL l = new OpL();
        l.adFirst("HEllo");
        l.adLast("sharad");
        l.printList();
    }
}