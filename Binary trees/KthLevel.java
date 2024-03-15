import java.util.*;

import org.w3c.dom.Node;
public class KthLevel{
    static class Node{
        int data;
        Node left;
        Node right;

            Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kLevel(Node root, int level, int k){
        //base case
        if(root == null){
            return;
        }
        //kaam
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        //inner calls
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        kLevel(root, 1, 3);
    }
}