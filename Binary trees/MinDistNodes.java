import java.util.*;
public class MinDistNodes{
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

    public static Node LCA2(Node root, int n1, int n2){    //here no extra space is taken by any arraylist
        //base case
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = LCA2(root.left, n1, n2);
        Node rightlca = LCA2(root.right, n1, n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }

        return root;
    }

    public static int getDist(Node lca, int n){

         if(lca == null){
            return -1;
        }
        if(lca.data == n){
            return 0;
        }
        int left = getDist(lca.left, n);
        int right = getDist(lca.right, n);

        if(left == -1 && right == -1){
            return -1;
        } else if(left == -1){
            return right + 1;
        } else{
            return left + 1;
        }
    }
    public static int MinDist(Node root, int n1, int n2){
        Node lca = LCA2(root, n1, n2);
        //base case
        
        int dist1 = getDist(lca, n1);
        int dist2 = getDist(lca, n2);
        
        return dist1 + dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(MinDist(root, 4, 6));
    }
}