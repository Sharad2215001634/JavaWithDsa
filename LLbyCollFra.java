import java.util.LinkedList;
public class LLbyCollFra {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("HEllo");
        list.addLast("Kumar");
        list.addLast("singh");
        list.addLast("Kumar");
        System.out.println(list);
        System.out.println(list.size());
        for(int i = 0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");
    }
}
