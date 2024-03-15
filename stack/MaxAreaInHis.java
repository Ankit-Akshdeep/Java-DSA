import java.util.*;
public class MaxAreaInHis{

    public static int MaxArea(int h[]){
        
        int nsl[] = new int[h.length];
        int nsr[] = new int[h.length];

            //calculating  the next smaller left
            Stack<Integer> s = new Stack<>();
            for(int i = 0; i<h.length; i++ ){
            while(!s.isEmpty() && h[s.peek()] >= h[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else{
                nsl[i] = s.peek();      //we need the index not the value
            }
              s.push(i);
        }

            //calculating the next smaller right
                s = new Stack<>();
            for(int j=h.length-1;j>=0; j--){
                while(!s.isEmpty() && h[s.peek()]>=h[j]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nsr[j] = h.length ;
                } else{
                    nsr[j] = s.peek();             // we need the index not the value
                }
                  s.push(j);
            }

               //calculating area for each bar
                int maxarea = Integer.MIN_VALUE;

                 //traversing through each bar
                 for(int k = 0; k<h.length; k++){
                  int area = (h[k] * (nsr[k] - nsl[k] - 1));             //widht = j - i - 1; so same as = nsr[i] - nsl[j] - 1;
        
                    maxarea = Math.max(maxarea, area);
                }

                return maxarea;

     
    }
    public static void main(String[] args) {
        int height[] = {2,1,5,6,2,3};
        System.out.println("Maximum Area is "+MaxArea(height));

     }
      
}