import java.util.*;
public class PushBottom{

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){         //here public static String reverseString(String str)
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length()){
           s.push(str.charAt(idx));
           idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
        char curr = s.pop();
        result.append(curr);
        }
        
        // str = result.toString();      //to convert string builder into string or we can return result.toString and return type of function would be String
        return result.toString();
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1); s.push(2); s.push(3);
        pushAtBottom(s, 4);

        while(!s.isEmpty()){
            System.out.println( s.pop());
        }

        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }

}