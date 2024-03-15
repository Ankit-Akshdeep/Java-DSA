import java.util.*;
public class ValidBST{
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
    public static boolean isValid(Node root, Node min, Node max){
        // base case
        if (root == null) {
            return true;
        }
        if(min!=null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }
    public static void main(String[] args) {
        int values[] = {5,3,1,4,6,7};
        Node root = null;
        for(int i = 0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        }
        System.out.println(isValid(root, null, null));
    }
}