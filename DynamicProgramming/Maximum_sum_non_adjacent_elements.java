/*
    1. You are given a number n, representing the count of elements.
    2. You are given n numbers, representing n elements.
    3. You are required to find the maximum sum of a subsequence with no adjacent elements.
*/


public class Maximum_sum_non_adjacent_elements {
    public static void main(String args[]) {
        int[] arr = {5,10,10,100,5,6};    
        maxSum(arr);
    }

    public static void maxSum(int[] arr){
        int lastInc = arr[0];
        int lastExc = 0;

        for(int i=1; i<arr.length; i++){
            int newlastInc = lastExc + arr[i];                 //Inclusion can happen only if last element was excluded
            int newlastExc = Math.max(lastExc , lastInc );    //Exclusion can happend on both last exclude or include so we take max of both as we want maximum sum
            lastInc = newlastInc;
            lastExc = newlastExc;
        }
        System.out.println(Math.max(lastInc,lastExc));
    }
}
