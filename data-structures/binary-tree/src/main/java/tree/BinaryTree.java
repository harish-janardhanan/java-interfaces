package tree;

public class BinaryTree {

    public static final String test = "t";

    class Node{
        int data;
        Node right;
        Node left;


        Node( int data){
            this.data = data;
            this.left = this.right =null;
        }
    }

    Node root;



    private Node addRecursive(Node current, int data){

        if (current == null){
            return new Node(data);
        }



        if (data < current.data){
            current.left = addRecursive(current.left, data);
        }else if(data > current.data){
            current.right = addRecursive(current.right,data);
        }else
            return current;
        return current;
    }

    public void add(int value){
        this.root = addRecursive(this.root,value);
    }

    private boolean containsRecursive(Node current, int value){

        if (current == null)
            return false;

        if (current.data == value)
            return true;

        return value > current.data ? containsRecursive(current.right,value) : containsRecursive(current.left,value);
    }

    public boolean contains(int value){
        return containsRecursive(this.root, value);
    }

    private int findSmallestValue(Node root){
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    private Node deleteRecursive(Node current, int value){
        if (current == null)
            return null;

        if (value == current.data){
            if (current.left ==null && current.right == null)
                return null;
            if (current.right == null)
                return current.left;
            if (current.left == null)
                return current.right;
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right,smallestValue);
            return current;
        }

        if (value < current.data){
            deleteRecursive(current.left, value);
        }else
            if (value > current.data){
                deleteRecursive(current.right, value);
            }
            return current;
    }

    public void delete(int value){
        this.root = deleteRecursive(this.root,value);
    }

}
