/*
    Given a matrix with each index filled with cost of being on that block.
    You can only move one step down or one step to the right at a time.
    Find the minimum cost in which you can reach from 0,0 to right corner of matrix .

    Example:     
    0 1 4 2 8 2
    4 3 6 5 0 4
    1 2 4 1 4 6
    2 0 7 3 2 2
    3 1 5 9 2 4
    2 7 0 8 5 1 <-- Reach here
*/


public class Minimum_cost_path_in_maze {
    public static void main(String args[]) {
        int[][] maze ={    
                    {0,1,4,2,8,2},
                    {4,3,6,5,0,4},
                    {1,2,4,1,4,6},
                    {2,0,7,3,2,2} };
        minCost(maze);
    }

    public static void minCost(int[][] maze ) {
        int r = maze.length,c = maze[0].length; 
        int[][] cache = new int[r][c];
        
        for(int i=r-1; i>=0; i-- ) {
            for(int j=c-1 ; j>=0 ;j--) {
                if(i==r-1 && j==c-1) {
                    cache[r-1][c-1] = maze[r-1][c-1] ;                   
                }
                else if(i==r-1) {
                    cache[i][j] = cache[i][j+1] + maze[i][j];
                }
                else if(j==c-1) {
                    cache[i][j] = cache[i+1][j] + maze[i][j];
                }
                else {
                    cache[i][j] = Math.min(cache[i][j+1],cache[i+1][j]) + maze[i][j];
                }
            }
        }
        System.out.println(cache[0][0]);
    }
}
