import java.util.*;
public class TreePreOrder{

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

    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx ++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    //print preorder
        public static void preorder(Node root){
        //base case
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        }

    //print inorder
        public static void inorder(Node root){
            //base case
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    //print postorder
        public static void postorder(Node root){
            //base case
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }    
 
    //print levelorder
        public static void levelorder(Node root){
            //base case
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();

                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else{
                    System.out.print(currNode.data +" ");
                    
                    if(currNode.left != null){
                        q.add(currNode.left);
                    } 
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
         }

         //height of tree
         public static int height(Node root){
            //base case
            if (root==null) {
               return 0;
              }
              int lh = height(root.left);
              int rh = height(root.right);
              int height = Math.max(lh, rh) + 1;
              
              return height;
         }

      //count of nodes
        public static int count(Node root){
            // base case
             if(root == null){
                return 0;
             }
             int lc = count(root.left);
             int rc = count(root.right);
             return lc + rc + 1;
        }   

        //sum of nodes
        public static int Sum(Node root){
            // base case
            if(root == null){
                return 0;
            }
            int ls = Sum(root.left);
            int rs = Sum(root.right);
            return ls + rs + root.data;
        }
    }
    

    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        //System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println();
        System.out.println(tree.height(root));
        System.out.println();
        System.out.println(tree.count(root));
        System.out.println();
        System.out.println(tree.Sum(root));
    }
}
