import java.util.*;
public class BalancedString{
    
    public static int MaxBalance(String str, int n){
        int l = 0, r = 0;
        int ans = 0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i) == 'L'){
                l++;
            } else{
                r++;
            }

            if(l == r){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();
        System.out.println("Maximum balanced string =" + MaxBalance(str, n));
    }
}