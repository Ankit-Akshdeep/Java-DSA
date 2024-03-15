import java.util.*;
public class Factorial{

    public static int Fact(int n){
        //base case
        if(n==1){
            return 1;
        }
         //kaaam
         int fnm1 = Fact(n-1);
         int fn = n* fnm1;
         return fn;
    }

    public static int friendsPairing(int n){
        //base case
        if(n==1|| n==2){
            return n ;
        }
        //kaam
        //choice
        //single
        int fnm1 = friendsPairing(n-1);
        
        //pairs
        int fnm2 = (n-1) * friendsPairing(n-2);
           
       int totways = fnm1 + fnm2;

       return totways;
    }

    public static void Binarystring(int n, int lastplace, String sb){
         //base case
         if(n==0){
            System.out.println(sb);
         return;
         }
        //kaam
        Binarystring(n-1,0, sb+"0");

        if(lastplace == 0){
            Binarystring(n-1, 0, sb+"1");

        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
        System.out.println(friendsPairing(n));
        Binarystring(n, 0, "");
    }
}