/*
    1. You are given a number n.
    2. In the next n rows you are given 3 numbers in each row representing the 
       cost of painting that house with red blue or green.
    3. You have to find the minimum cost of painting n houses such that no two consecutive houses 
        have the same color 

*/

public class Paint_House {
    public static void main(String args[]){
        int[][] arr = 
        {   {1,5, 7},
            {5 ,8, 4},
            {3 ,2, 9},
            {1 ,2 ,4 }
        };

        mincost(arr);
    }



    // DP without Array
    public static void mincost(int[][] arr ){
        int firstcolor = arr[0][0];
        int secondcolor = arr[0][1];
        int thirdcolor = arr[0][2];
        
        for(int i=1; i<arr.length; i++){
            int newFirst = Math.min(secondcolor,thirdcolor) + arr[i][0];
            int newSecond = Math.min(firstcolor,thirdcolor) + arr[i][1];
            int newThird = Math.min(firstcolor,secondcolor) + arr[i][2];

            firstcolor = newFirst;
            secondcolor = newSecond;
            thirdcolor = newThird;
        }

        int mincost =  Math.min (Math.min(firstcolor,secondcolor), thirdcolor );
        System.out.println(mincost);
    }


    //Dynamic Programming
    // public static void mincost(int[][] arr ){
    //     int[][] dp = new int[arr.length][arr[0].length];
        
    //     for(int j=0; j<dp[0].length ; j++){
    //         dp[0][j] = arr[0][j];
    //     }

    //     for(int i=1; i<dp.length; i++){
    //         dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + arr[i][0] ;
    //         dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + arr[i][1] ;
    //         dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + arr[i][2] ;
    //     }


    
    //     int mincost = Integer.MAX_VALUE;
    //     for(int j=0; j<dp[0].length; j++ ){
    //         mincost = Math.min(dp[dp.length-1][j],mincost);
    //     }
    //     System.out.println(mincost);
    // } 
}
