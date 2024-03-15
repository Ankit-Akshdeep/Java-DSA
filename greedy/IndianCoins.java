import java.util.*;
public class IndianCoins{
    public static void main(String[] args) {
        int coins[] ={1,2,5,10,20,50,100,500,2000};
        int amount = 590;
        int c = 0; //for counting the number of coins
        
        ArrayList<Integer> ans = new ArrayList<>();   //to store the answers
        
        //sorting
        Arrays.sort(coins);

        //taking it in descending order
        for(int i = coins.length - 1; i>=0; i--){
            if(coins[i] <= amount){

            //checking if my amount is greater than the curr coin value
                while (coins[i] <= amount){
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                    c++;
                }
            }
        }
        System.out.println("number of coins required = "+ c);

        for(int i = 0; i< ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}