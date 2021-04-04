public class NQueens {


/*
Given a size N x N chessboard. Print all solutions which place N number of queens safely.
Queen can move in 6 directions(Find those out on your own).


*/

    public static void main(String args[]) {

        int n = 4;
        int[][] chess = new int[n][n];
        placeNQueens(0,0,chess,"");

    }

    public static void placeNQueens(int row, int placedQueens ,int[][] chess, String path) {

        if(placedQueens == chess.length ) {    //All queens placed Condition
            System.out.println(path );
            return;
        }
        
        if(row == chess.length) {             //Went Out of chessboard
            return;
        }

        //Check which row queen is safe in
        for(int col = 0 ; col < chess[0].length ; col++ ) {
             if(isQueenSafe(row,col,chess)) {
                chess[row][col] = 1;             //Record ur step
                placeNQueens(row + 1, placedQueens + 1, chess, path + row + col + " ");
                chess[row][col] = 0;             //Backtrack ur step
             }
        }
    }

    public static Boolean isQueenSafe(int row,int col,int[][] chess) {

        //Straight up
        for (int i = row , j = col ; i >= 0  ; i-- ) {            
            if ( chess[i][j] == 1 ) {
                return false;
            }
        }

        //Upper Left Diagnol
        for (int i = row , j = col ; i >= 0 && j>=0  ; i--,j-- ) {
            if ( chess[i][j] == 1 ) {
                return false;
            }
        }

        //Upper Right Diagnol
        for (int i = row , j = col ; i >= 0 && j < chess[0].length  ; i--,j++ ) {
            if ( chess[i][j] == 1 ) {
                return false;
            }
        }
        return true;
    }
}
