/*
    You are given a string s.
    You have to count the number of subsequences of type a.. + b... + c...
    ... means that a can come many times between a and b but not anywhere.
*/

//Doubty
//Cleared

public class Count_Subsequences_of_pattern {
    public static void main(String args[] ) {
        String s = "abbc";          
        countSubsequences(s);
    }

    public static void countSubsequences(String s) {
        
        int a = 0;
        int ab = 0;
        int abc = 0;

        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == 'a') {
                a = 2*a + 1;             //a can add itself with previous or not add and it can start a sequence itself  so 2*a +1
            }else if (curr == 'b'){
                ab = 2*ab + a;             //b can add itself with previous a+b or not add those all will be ending with b. or it can add itself after string of a to form new sequence
            
            }else if (curr == 'c'){      // c can add itself with previous a+b+c or not add or it can add itself to previous a+b
                abc = 2*abc + ab;
            }
        }
        System.out.println(abc);

    }
}
