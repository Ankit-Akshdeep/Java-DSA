import java.util.*;
public class First{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //is empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //add/push
        public static void push(int data){
         list.add(data);
    }
        //remove/pop
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size() - 1);
            return top;
        }
        //peek
        public static int Peek(){
            return list.get(list.size()-1);
        }
 }
 public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1); s.push(2);
    s.push(3);

    while(!s.isEmpty()){
        System.out.println(s.Peek());
        s.Pop();
    }
 }
}