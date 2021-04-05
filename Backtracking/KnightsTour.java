
/* Given chessboard of size NxN.
Print all combinations in which Knight can visit all the positions once.
*/


public class KnightsTour {
    public static void main(String args[]) {
        int[][] chess = new int[5][5];
        knightsTour(0,0,1,chess,"");
    }
    
    public static void knightsTour(int r,int c, int placed, int[][] chess,String path ) {
        //Out of chessboard RETURN
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] != 0) {
            return;
        }
        //All positions visited
        else if (placed == chess.length*chess.length ) {
            chess[r][c] = placed;

            for(int i = 0 ; i < chess.length ; i++) {
                for (int j = 0 ; j < chess.length ; j++) {
                    System.out.print(chess[i][j]+ " "+ '\t');
                }
                System.out.println();
            }
            chess[r][c] = 0;
            System.out.println();
            System.out.println();
            System.out.println();

            return;
        }
        
        chess[r][c] = placed;
        knightsTour(r-2, c+1, placed + 1, chess, path + r+c + "-->");
        knightsTour(r-1, c+2, placed + 1, chess, path + r+c + "-->");
        knightsTour(r+1, c+2, placed + 1, chess, path + r+c + "-->");
        knightsTour(r+2, c+1, placed + 1, chess, path + r+c + "-->");
        knightsTour(r+2, c-1, placed + 1, chess, path + r+c + "-->");
        knightsTour(r+1, c-2, placed + 1, chess, path + r+c + "-->");
        knightsTour(r-1, c-2, placed + 1, chess, path + r+c + "-->");
        knightsTour(r-2, c-1, placed + 1, chess, path + r+c + "-->");
        chess[r][c] = 0;        
    }
}
