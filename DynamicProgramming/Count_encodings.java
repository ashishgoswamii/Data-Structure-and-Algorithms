/*
    Given a string of digits.
    You have to print the number of encoding that are possible for that string.
    each digit corresponsds to it's character
    1-a
    2-b
    .
    .
    . 
*/

//Doubty

public class Count_encodings {
    public static void main(String args[]) {
        String s = "1223";
        countEncodings(s);
    }

    public static void countEncodings(String s) {

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<dp.length; i++) {
            char last = s.charAt(i-1);
            char seclast = s.charAt(i-2);

            if(last == '0'  && seclast =='0') {
                dp[i] = 0;

            } else if( last == '0' ) {
                if(seclast == '1' || seclast == '2' ) {
                    dp[i] = dp[i-2];
                }else {
                    dp[i] = 0;               //Discard previous as well
                }

            } else if(seclast == '0') {
                dp[i] = dp[i-1];

            } else {
                if( Integer.parseInt( s.substring(i-2,i) ) <= 26 ) {
                    dp[i] = dp[i-1] + dp[i-2];
                }else {
                    dp[i] = dp[i-1];
                }
            }
        }

        System.out.println(dp[s.length()]);
    }
    
}
