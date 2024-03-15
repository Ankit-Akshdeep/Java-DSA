import java.util.*;
public class HIPPS{

    static class heap{
        //create arraylist
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1)/2;

            while (arr.get(x) < arr.get(par)) {
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
            int minidx = i;

            if( left < arr.size() && arr.get(minidx) > arr.get(left) ){
                minidx = left;
            }
            if(tight < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;
            }

            if(minidx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                heapify(minidx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            //step 1 - swap first and last elem
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size()-1 ,temp);

            //step 2 - delete last
            arr.remove(arr.size() - 1);

            //step 3 - heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return (arr.isEmpty());
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        
    }
}