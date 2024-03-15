import java.util.*;
public class ConvertBSTtoBST{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int si, int ei){
        // Base case: If there is no element to consider
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, si, mid-1);
        root.right = createBST(inorder, mid+1, ei);
        return root;
    }

    public static Node BalancedBST(Node root){
        //inorder
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        //sorted inorder to balanced bst
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;

    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        
        root = BalancedBST(root);
        preorder(root);

    }
}