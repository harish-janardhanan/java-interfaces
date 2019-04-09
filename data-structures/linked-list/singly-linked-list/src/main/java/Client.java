public class Client {



    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Printing Empty List.....");
        linkedList.printList();

        linkedList.insert( 1);
        linkedList.insert( 2);
        linkedList.insert( 3);
        linkedList.insert( 4);
        linkedList.insert( 5);

        System.out.println("List after addition of data...");

        linkedList.printList();

        System.out.println("Removing 4 from list...");
        linkedList.deleteByKey(4);
        linkedList.printList();

        System.out.println("removing from position 1");
        linkedList.deleteByPos(0);
        linkedList.printList();

        System.out.println("removing from random pos");

        linkedList.deleteByPos(2);
        linkedList.printList();

        linkedList.insert(1);
        linkedList.insert(5);
        linkedList.insert(4);

        System.out.println("reinsert..");
        linkedList.printList();
        linkedList.head.next.next.next = linkedList.head;

        System.out.println(linkedList.detectLoop());


    }
}
