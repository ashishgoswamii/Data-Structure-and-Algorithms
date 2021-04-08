/*
    Given an array of n numbers. Given a target value t.
    Find out if there is a subset sum of which is equal to t.
    Print true if it exists. 
    Else false
*/

public class Target_sum_subsets {
    public static void main(String args[]){
        
        int[] nums = {2,4,3,5,6};
        int t = 7;
        ifSubsetExist(nums, t);
    }

    public static void ifSubsetExist(int[] nums, int t){

        //Taking a 2D DP as repetion is not allowed.
        boolean[][] dp = new boolean[nums.length+1][t+1];
        
        //Outer loop for each number . Inner loop for sum possible.
        for(int i=0 ; i<dp.length ;i++) {
            for (int j=0 ; j<dp[0].length ;j++) {
                if(i==0 && j==0) {
                    dp[i][j] = true;    //Top Row j=0 i.e sum =0 sum 0 can be formed without any element

                }else if( i==0 ) {      //Top Row without any element no sum can be formed except 0
                    dp[i][j] = false;

                }else if( j==0)  {      //First column. j=0 i.e Sum=0 can be formed by all numbers.
                    dp[i][j] = true;

                }else {                 
                    if( dp[i-1][j] == true ) {    //Check directly up if sum is already possible
                        dp[i][j] = true;
                    }else if ( nums[i-1] <= j ) {     //Check if sum being formed is atleast equal to the current number so it can participate
                        int remsum = j-nums[i-1];
                        if(dp[i-1][remsum] == true) {       //If after adding this number check if the previous guy was able to make the sum that was remaining
                            dp[i][j] = true;
                        }else {                      //If he can't make it and previously it hasn't been made than it won't be possible
                            dp[i][j] = false;
                        }
                    }else {                       //If the current number is greater than sum being formed than obviously it cannot participate
                        dp[i][j] = false;
                    }
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);

        //Showing DP Table which will show all possible value till our target t
        for(int i=0; i<dp[0].length;i++){
            System.out.print(i+ "\t");
        }
        System.out.println();

        for(int i=0 ;i<dp.length; i++) {
            for (int j=0 ; j<dp[0].length; j++) {
                System.out.print(dp[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
