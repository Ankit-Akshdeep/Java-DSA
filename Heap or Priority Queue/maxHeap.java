import java.util.*;
public class maxHeap{
    static class Heap{
        //create one AL
        ArrayList<Integer> arr = new ArrayList<>(); 
        
        public void add(int data){
            //added at the last
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x-1)/2;

            while(arr.get(x) > arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int maxidx = i;

            while(left < arr.size() && arr.get(maxidx) < arr.get(left) ){
                maxidx = left;
            }
            while(right < arr.size() && arr.get(maxidx) < arr.get(right)){
                maxidx = right;
            }

            if(maxidx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(maxidx));
                arr.set(maxidx, temp);
                
                heapify(maxidx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            //swap the first and the last elem
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //remove the last elem
            arr.remove(arr.size() - 1);

            //heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return (arr.isEmpty());
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(1);
        h.add(4);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}