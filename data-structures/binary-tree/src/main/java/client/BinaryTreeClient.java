package client;

import org.junit.Assert;
import tree.BinaryTree;

import java.util.*;

public class BinaryTreeClient {
    int test;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);

        Map<Integer, Integer> newMap = new HashMap<>();





        Assert.assertTrue(bt.contains(4));
        Assert.assertFalse(bt.contains(10));

        bt.delete(4);
        Assert.assertFalse(bt.contains(4));
    }
}
