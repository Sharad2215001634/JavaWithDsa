public class Practice {
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

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already empty");
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is already empty");
        }
        if(head == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public void reverseItrate(){
        if(head == null || head.next == null){
            return;
        }

        Node preNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preNode;
    }



    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " - > ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        Practice l = new Practice();
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.printList();

        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.printList();

        l.reverseItrate();
        l.printList();

        l.deleteFirst();
        l.printList();

        l.deleteLast();
        l.printList();


        
    }
}