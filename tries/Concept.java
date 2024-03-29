import java.util.*;
public class Concept{
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;
        
        Node(){
            for(int i = 0; i<children.length;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level = 0 ; level<word.length() ; level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            else{
                curr = curr.children[idx];
            }
        }
        if(curr.endOfWord == true){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i = 0; i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}