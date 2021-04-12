
/*
    You are given an array of digits.
    Your task is to find the longest sequence of consecutive elements that are present in that array
    Elements need not to be next to each other in the array itself
*/

import java.util.HashMap;
public class Longest_sequence_of_consecutive_elements {
    public static void main(String args[]) {
        int[] arr = {1,2,3,5,6,9,23,24,25,26 };
        longestSeq(arr);
    }

    public static void longestSeq(int[] arr) {
        HashMap<Integer,Boolean> hm = new HashMap<>();
        
        for(int val : arr) {
            hm.put(val,true);
        }

        for(int val : arr) {
            if(hm.containsKey(val-1)){
               hm.put(val,false);    
            }
        }
        int max = 0;
        for(int val : arr) {
            int tmax = 1;
            while( hm.containsKey(val+1) ){
                val++;
                tmax++;
            }
            if(tmax >max ){
                max = tmax;
            }
        }
        System.out.println( "Longest Sequence of consecutive characters : "+  max);
    }
}
