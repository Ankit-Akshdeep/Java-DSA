import java.util.*;
public class FindSubsets{

    public static void Subset(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NUll");
            } else{
                System.out.println(ans);
            }
            return;
        }
        //recursion with choice
        //yes - choice
        Subset(str, ans+str.charAt(i), i+1);
        //no - choice
        Subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        Subset(str, "", 0);
    }
}