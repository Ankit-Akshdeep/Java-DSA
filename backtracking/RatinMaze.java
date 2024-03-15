import java.util.*;
public class RatinMaze{

    public static void printSolution(int sol[][]){
        for (int i = 0; i < sol.length; i++){
            for(int j = 0; j< sol.length ; j++){
                System.out.print(sol[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int row, int col){
        if (row >= 0 && col >= 0 && row < maze.length && col < maze[0].length && maze[row][col] == 1){
            return true;
        }
        return false;
    }

    public static boolean solveMazeuntil(int maze[][], int row, int col, int sol[][]){
        //base case
        if(row == maze.length - 1 && col == maze.length - 1 && maze[row][col]==1){
             sol[row][col] = 1;
            return true;
           
        }
        //kaam
        if(isSafe(maze, row, col) == true){
            if(sol[row][col] == 1){
                return false;
            }
            sol[row][col] = 1;
            if( solveMazeuntil(maze, row+1, col, sol)){
                return true;
            }
            if(solveMazeuntil(maze, row, col+1, sol)){
                return true;
            }
            sol[row][col] = 0;
            return false;
        }
        return false;

    }

    public static boolean solve(int maze[][]){
        int n = maze.length;
        int sol[][] = new int[n][n];
       if(solveMazeuntil(maze, 0 , 0 , sol) == false){
        System.out.println("Solution doesnt exist");
        return false;
       }
       printSolution(sol);
       return true;
       
    }
    public static void main(String[] args) {
        int maze[][]= {{1,0,0,0},{1,1,0,1}, {0,1,0,0}, {1,1,1,1}};

        solve(maze);
    }
}