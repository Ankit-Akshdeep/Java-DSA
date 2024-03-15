import java.util.*;
public class nQueens{
    static int count = 0;
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i = row - 1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i = row -1, j = col - 1; i>=0 && j>=0 ; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagonal right up
        for(int i = row - 1, j = col+1; i>=0 && j<board.length; i--, j++ ){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }


    public static void NQ(char board[][], int row){
        //base case
            if(row == board.length){
                printBoard(board);
                count ++;
                return;
            }
        //kaam
       //column loop
        for(int j =0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                NQ(board, row+1);   //recursion
                board[row][j] = 'X';    //backtracking step
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("---------chess board-----------");
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
            //initialise
            for(int i =0; i<n ; i++){
                for(int j = 0; j< n ; j++){
                    board[i][j] = 'X';
                }
            }
            NQ(board, 0);
            System.out.println("All possible ways to place N queens is "+ count);
    }
}