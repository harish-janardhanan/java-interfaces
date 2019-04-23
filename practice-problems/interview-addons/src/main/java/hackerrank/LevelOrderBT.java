package hackerrank;

import java.util.ArrayDeque;
import java.util.Scanner;

public class LevelOrderBT {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static ArrayDeque<Node> pushNodes(ArrayDeque<Node> arrayDeque, Node root) {
        if (root.left != null)
            arrayDeque.push(root.left);
        if (root.right != null)
            arrayDeque.push(root.right);
        return arrayDeque;
    }

    static void levelOrder(Node root) {

        if (root == null)
            return;
        Node right = root.right;
        Node left = root.left;
        ArrayDeque<Node> nodeArrayDeque = new ArrayDeque<>();
       // pushNodes(nodeArrayDeque, root);

        nodeArrayDeque.add(root);
        String number = "";

        while (!nodeArrayDeque.isEmpty()){
            Node temp = nodeArrayDeque.poll();
            number+= temp.data + " ";

            if (temp.left != null)
                nodeArrayDeque.add(temp.left);
            if (temp.right != null)
                nodeArrayDeque.add(temp.right);
        }

        System.out.println(number.trim());
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

}
