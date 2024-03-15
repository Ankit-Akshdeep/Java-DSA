import java.util.*;
public class Sudoku{

    public static boolean isSafe(int board[][], int row, int col, int digit){
        //for column
        for(int i = 0 ; i< 9 ; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        //for row
        for(int j=0 ;j < 9 ; j++) {
            if(board[row][j] == digit){
                return false;
            }
        }

        //for grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i = sr; i<sr+3 ; i++){
            for(int j = sc ; j<sc+3 ; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokusolver(int board[][], int row, int col){
        //base case
        if(row == 9 && col == 0){
            return true;
        } 

        //recursion
        int nextRow = row; int nextCol = col + 1;
        if(col + 1 == 9){
            nextRow = row + 1;
            nextCol = 0;
        }

        if(board[row][col] != 0){
            return sudokusolver(board,nextRow,nextCol);
        }

        for(int digit = 1 ; digit <=9 ;digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(sudokusolver(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = 0;
            }
        } 
        return false;

    }

    public static void printSudoku(int board[][]){
        for(int i = 0; i<9 ; i++){
            for(int j = 0; j<9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int board[][] = {{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2}, {0,0,3,0,0,4,1,9,0},{1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},{9,6,0,4,0,5,3,0,0},{0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
        if(sudokusolver(board, 0, 0)){
            System.out.println("Solved");
            printSudoku(board);
        } else{
            System.out.println("Solution does not exists");
        }
}
}
