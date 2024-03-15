import java.util.*;
public class ArrToBST{
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
    public static Node toBST( int arr[], int si, int ei){
        if(si>ei){
            return null;
        }  
      
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);
        root.left = toBST(arr, si, mid - 1);
        root.right = toBST(arr, mid+1, ei);
        return root;
    }
    public static void printInorder(Node node){
        if(node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data+" ");
        printInorder(node.right);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
        Node root = null;
        for (int i=arr.length-1;i>=0;i--){
            root = insert(root, arr[i]);
        }
        root = toBST(arr, 0, arr.length-1);
        printInorder(root);
    }
}