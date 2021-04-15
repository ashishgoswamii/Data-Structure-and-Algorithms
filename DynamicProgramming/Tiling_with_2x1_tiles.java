/*
    1. Given a floor of size 2xN.
    2. Given infinte tiles of size 2x1.
    3. Find in how many ways can you tile the entire floor 
*/


public class Tiling_with_2x1_tiles {
    public static void main(String args[]){
        int n = 8;
        waysTiling(n);
    }   
    
    public static void waysTiling(int n){
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3 ; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
