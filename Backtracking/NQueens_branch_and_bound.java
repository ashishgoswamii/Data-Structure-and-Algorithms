/*

Given a size N x N chessboard. Print all solutions which place N number of queens safely.
Queen can move in 6 directions(Find those out on your own).

Sol - Instead of checking everytime if queen is safe. I will mark all the positions that
      will be unsafe in different arrays . 
      All diagonal1 positions.
      All diagonal2 positions.
      All columns.
      No need for rows as we already are putting the next queen in next row.
      
      As we put a queen we will mark all unsafe spots associated with it in this array.
      before putting another queen in next row we will check if that position is safe using 
      our history.
*/



public class NQueens_branch_and_bound {
    public static void main(String args[]){
        int n = 4;
        int[][] chess = new int[n][n];
        Nqueens(n,chess);
    }   
    
    public static void Nqueens(int n,int[][] chess){
        boolean[] coltrack = new boolean[chess[0].length];
        boolean[] diag1track = new boolean[2*n-1];
        boolean[] diag2track = new boolean[2*n-1];
        Nqueenshelper(chess,n,0,coltrack,diag1track,diag2track,"");
    }

    public static void Nqueenshelper(int[][] chess,int n,int row,boolean[] coltrack,
    boolean[] diag1track, boolean[] diag2track ,String asf){
        
        if(row == n) {
            System.out.println(asf);
            return;
        }

        for(int col=0; col<chess[0].length; col++) {

            if(coltrack[col] == false && diag1track[col+row] == false 
            && diag2track[col-row + n -1] == false ){

                chess[row][col] = 1;
                coltrack[col] = true;
                diag1track[row+col] = true;
                diag2track[col-row+n-1] = true;
                Nqueenshelper(chess, n, row+1, coltrack, diag1track, diag2track, asf + " (" +row + col+")"  );
                chess[row][col] = 0;
                coltrack[col] = false;
                diag1track[col+row] = false;
                diag2track[col-row+n-1] = false;
            }
        }
    }
}

