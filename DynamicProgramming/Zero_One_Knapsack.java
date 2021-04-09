/*
    We have a bag whose capacity to carry weight is c.
    We have some elements with their value and their respective weights.
    We have to maximise the value of bag without violating it's weight c.
    Each element can only be used once or none at all.
*/


public class Zero_One_Knapsack {
    public static void main(String args[]) {
        int[] weight = {2,5,1,3,4};
        int[] value = {15,14,10,45,30};
        int capacity = 7;
        fillKnapsack(weight,value,capacity);
    }

    public static void fillKnapsack(int[] weight, int[] value,int capacity) {

        int[][] dp = new int[value.length + 1][capacity+1]; 

        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                }else if( j >= weight[i-1] ){
                    int remWeight = j- weight[i-1];
                    dp[i][j] = Math.max( (dp[i-1][remWeight] + value[i-1]),dp[i-1][j] ); 
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }
}
