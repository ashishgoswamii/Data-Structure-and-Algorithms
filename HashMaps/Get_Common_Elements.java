
/*
You are given two Strings s1 and s2 you have to print all elements of s2 which are in s1
Make sure to not print duplicates and order of printing must be according to s2.
Example : if s2 has single a and s1 has multiple a's then a must be printed only once.
*/

import java.util.HashMap;

public class Get_Common_Elements{
    public static void main(String args[]) {
        String s1 = "babcd";
        String s2 = "abc";
        getCommonElements(s1, s2);
        
    }        

    public static void getCommonElements(String s1, String s2) {
        HashMap<Character,Integer> hashy = new HashMap<>();
        //Put string1 in hashmap along with frequency of each character.
        for(int i=0; i<s1.length(); i++) {
            char curr = s1.charAt(i);
            if(hashy.containsKey(curr)) {
                int oldv = hashy.get(curr);
                hashy.put(curr,oldv+1);
            }else {
                hashy.put(curr,1);
            }
        }

        for(int i=0; i<s2.length(); i++) {
            char curr = s2.charAt(i);
            if(hashy.containsKey(curr)){
                int oldv = hashy.get(curr);
                if(oldv == 1) {
                    hashy.remove(curr);
                }else {
                    hashy.put(curr, oldv-1);
                }
                System.out.print(curr + " " );
            }
        }

    }
}