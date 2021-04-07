import java.util.HashMap;
import java.util.Set;

/*
    Given an array of charcaters.
    Print the characters which has occured most times and it's frequency.
*/

public class Highest_Frequency_Character{
    public static void main(String args[]) {
        String sample = "abcsjfffkjgdkkks";
        char[] result = highestFrequency(sample);
        System.out.println(result[0]+ " " + result[1]);
        
    }

    public static char[] highestFrequency(String str) {

        //Put key if seen for the first time in hashmap with frequency 1.
        //If key already in hashmap increase it's value.
        HashMap<Character,Integer> hashy = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            if(hashy.containsKey(curr)) {
                int oldv = hashy.get(curr);
                hashy.put(curr, oldv + 1); 
            }else {
                hashy.put(curr, 1);
            }
        }

        //Initialise maxFrequency with first character of string and it's frequency
        char maxChar = str.charAt(0);
        int maxF=hashy.get(maxChar);

        //Check which value has highest frequency in hashmap
        Set<Character> freqset = hashy.keySet();
        for( char key : freqset ) {
            if( hashy.get(key) > maxF ) {
                maxF = hashy.get(key);
                maxChar = key;
            }
        }

        char[] res = {maxChar,(char)(maxF+'0')};
        return res;
    }
}