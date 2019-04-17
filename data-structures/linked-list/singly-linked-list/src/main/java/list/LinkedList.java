package list;

public class LinkedList<T> {
    public Node head;

    public static class Node<T> {
        T data;
        public Node next;

        Node (T data){
            this.data = data;
        }
    }

    public void push(T data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insert( T data){
        Node newnode = new Node(data);

        if(this.head == null){
            head = newnode;
        } else
        {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newnode;

        }

    }

    public void deleteByKey( T key){

        Node currentNode = this.head, prev = null;

        if (head != null && head.data.equals(key)){
            this.head = currentNode.next;
            return;
        }

        while (currentNode != null && !currentNode.data.equals(key)){
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null){
            prev.next = currentNode.next;
        }

    }

    public void deleteByPos( int pos){
        Node current = this.head, prev = null;
        int counter = 0;
        if (current != null && pos == 0){
            this.head = current.next;
            return;
        }
        while (current != null){
            if (counter == pos){
                prev.next = current.next;
                break;
            }else {
                prev = current;
                current = current.next;
                counter++;
            }

        }
    }

    public boolean detectLoop(){
        Node head = this.head;

        Node fastPtr = head;
        Node slowPtr = head;

        while (fastPtr != null && slowPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr){
                return true;
            }
        }

        return false;
    }
    public void printList(){
        Node next = this.head;

        if (this.head == null)
            System.out.println("Empty List");

        while (next != null){
            System.out.println(next.data);
            next = next.next;
        }
    }
}
