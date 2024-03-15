import java.util.*;
public class Diameter{

    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   

    // static class BinaryTree{
    //     static int idx = -1;
    //     public static Node BuildTree(int nodes[]){
    //         idx ++;
    //         if (nodes[idx] == -1) {
    //             return null;
    //         }
    //         Node newNode = new Node(nodes[idx]);
    //         newNode.left = BuildTree(nodes);
    //         newNode.right = BuildTree(nodes);

    //         return newNode;
    //     }
    //     //height of tree
    // public static int height(Node root){
    //     //base case
    //     if (root==null) {
    //        return 0;
    //       }
    //       int lh = height(root.left);
    //       int rh = height(root.right);
    //       int height = Math.max(lh, rh) + 1;
          
    //       return height;
    //  }

    // //diameter

    // public static int diameter(Node root){
    //     //base case
    //     if(root == null){
    //         return 0;
    //     }
    //         int ldiam = diameter(root.left);
    //         int rdiam = diameter(root.right); 
       
    //         int lheight = height(root.left);
    //         int rheight = height(root.right);

    //         int selfdiam = lheight + rheight + 1;

    //         return Math.max(selfdiam, Math.max(ldiam, rdiam));
    // }
    
    // }
    //approach 2
     static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info D2(Node root){
        //base case
        if(root == null){
            return new Info(0, 0);
        }

        Info linfo = D2(root.left);
        Info rinfo = D2(root.right);
        
        int diam = Math.max(Math.max(linfo.diam, rinfo.diam), linfo.ht + rinfo.ht + 1);
        int ht = Math.max(linfo.ht, rinfo.ht) + 1;

        return new Info(diam, ht);
    }
    
    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.BuildTree(nodes);
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);

       System.out.println(D2(root).diam);
    }
}