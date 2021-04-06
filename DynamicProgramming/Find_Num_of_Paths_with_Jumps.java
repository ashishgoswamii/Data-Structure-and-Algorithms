/*
    We need to find no of paths available if we are climbing stairs.
    Max size of jumps for each stair will be given in a separate array with its index being stair number.
    Print total no of paths that are available from the 0th stair to reach the Nth stair. 
*/



public class Find_Num_of_Paths_with_Jumps {

    static int[] jumpsallowed = {3,2,1,1,1,2};
    public static void main (String args[]) {
        int finalStair = 6;
        int[] DP = new int[7];
        int paths = findPaths(finalStair,DP);
        System.out.println(paths);
    }    

    public static int findPaths(int finalstair,int[] DP) {
        
        DP[finalstair] = 1;
        //Using tabulation Method of DP
        for(int i=finalstair-1 ; i>=0 ; i--) {
            for(int j=1 ; j<=jumpsallowed[i] && j+i<=finalstair;j++) {
                DP[i] +=  DP[i+j];
            }
        }
        return DP[0];
    }
}
