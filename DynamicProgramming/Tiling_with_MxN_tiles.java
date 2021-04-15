/*
    1. Given a floor of size MxN.
    2. Given infinte tiles of size Mx1.
    3. Find in how many ways can you tile the entire floor 
*/

public class Tiling_with_MxN_tiles {
    public static void main(String args[]){
        int n = 39;
        int m = 16;
        waysTiling(n, m);

    }

    public static void waysTiling(int n, int m){
        int[] dp = new int[n+1];
        
        for(int i=1; i<=n; i++){
            if(i<m){
                dp[i] = 1;                 //Length of floor smaller than breadth so we can only place tiles vertically 
            }
            else if(i==m){
                dp[i] = 2;
            }
            else {
                dp[i] = dp[i-1] + dp[i-m];
            }
        }
        System.out.println(dp[n]);
    }
}
