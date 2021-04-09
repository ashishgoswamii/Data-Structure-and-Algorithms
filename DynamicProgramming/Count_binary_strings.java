/*
    1. You are given a number n.
    2. Print the maximum number of binary strings without consecutive zeroes.

    Example - 110,1010 is allowed but 1001 or 1100 not allowed.
*/

public class Count_binary_strings {

    public static void main(String args[]) {
        int n = 4;
        countBinary(n);
    }

    public static void countBinary(int n) {

        //Cache stores the number of binary string possible for n corresponding to it's i'th index
        //0 row stores strings ending with 0
        //1st row stores strings ending with 0
        int[][] cache = new int[2][n+1] ;


        cache[0][1] = 1;   //1 length binary string ending with 0 = 0
        cache[1][1] = 1;    // 1 length binary string ending with 1 = 1

        for(int i=2 ; i<cache[0].length; i++) {

            cache[0][i] = cache[1][i-1];        //Don't add 0 to strings ending with 0 as it will violate the rules so only use the ones ending with 1
            cache[1][i] = cache[1][i-1] + cache[0][i-1]  ;    // 1 can be added to end of Strings ending with 0 or 1 
        }

        int count = cache[0][n] + cache[1][n];
        System.out.println(count);
    }

}


