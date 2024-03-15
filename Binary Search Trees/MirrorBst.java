import java.util.*;
public class MirrorBst{
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
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left , val);
        } 
        if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static Node Mirror(Node root){
        if(root == null){
            return root;
        }
        Node left = Mirror(root.left);
        Node right = Mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11};
        Node root = null;
        for(int i = 0 ; i< values.length ; i++){
            root = insert(root, values[i]);
        }
    }
}