public class LL{
Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "=>");
            currNode = currNode.next;

        }
        System.out.println("NUll");
    }


    public static void main(String[] args) {
       LL l = new LL();
       l.addFirst("Hello");
       l.addFirst("kuamr");
       l.addFirst("Hellsdfo");
       l.addFirst("Hellosdf");
       l.printList();
    }
}