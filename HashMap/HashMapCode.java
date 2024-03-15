import java.util.*;
public class HashMapCode{
    
    static class HashMap<K,V>{       //generics, because key and value can be string, integer, float ; anything. So type is not fixed
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
           
        }
            private int n; //n
            private int N;
            private LinkedList<Node> buckets[]; //N

            @SuppressWarnings("unchecked")
            public HashMap(){
                this.N = 4;
                this.buckets = new LinkedList[4];//default capacity is 4

                for(int i = 0; i<4; i++){
                    this.buckets[i] = new LinkedList<>();
                }
            }

        private int hashfunction(K key){
            int hc = key.hashCode();   //hashcode
            return Math.abs(hc) % N;   
        }   
        
        private int SearchinLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di= 0;
            for(int i = 0; i<ll.size(); i++){
                Node node = ll.get(i);

                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i = 0; i<buckets.length ; i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes add to newbuck
            for(int i = 0; i<oldbuck.length ; i++){
                LinkedList<Node> ll = oldbuck[i];
                for(int j = 0 ; j< ll.size() ; j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashfunction(key);          // bucket index
            int di = SearchinLL(key,bi);         //valid; or -1;
            
            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
             
            double lambda = (double)n/N;

            if(lambda > 2.0){
                rehash();
            }

        }    

        public boolean containsKey(K key){
           int bi = hashfunction(key);          // bucket index
            int di = SearchinLL(key,bi);         //valid; or -1;
            
            if(di != -1){
                return true;
            } else{
              return false;
            }
        }

        public V get(K key){
            int bi = hashfunction(key);          // bucket index
            int di = SearchinLL(key,bi);         //valid; or -1;
            
            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else{
                return null;
        }
    }

        public V remove(K key){
            int bi = hashfunction(key);          // bucket index
            int di = SearchinLL(key,bi);         //valid; or -1;
            
            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else{
                return null;
            }
        }

        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0 ;i<buckets.length ; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
    
    public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("India", 100);
            map.put("China", 50);
            map.put("Nepal", 90);
        
            ArrayList<String> keys = map.keyset();

            for (String key : keys) {
                System.out.println(key);
            }
    }
}