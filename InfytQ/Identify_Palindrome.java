/* 1.Given a number N.
   2.Add N with it's reverse.
   3.If the resultant is pallindrome print it
   4.Else add resultant with it's sum and check if pallindrome.
   5.Continue this until pallindrome is found.
*/


class Identify_Palindrome {
    public static void main(String args[]) {
        String input = "";                
        identifyPalindrome(input);   
    }

    static void identifyPalindrome(String origval) {
      
        StringBuilder originalnum = new StringBuilder(origval);  
        StringBuilder reversesb = originalnum.reverse();
        int revval = Integer.parseInt(reversesb.toString()); 
        
        //Add the original and reverse
        int sum = (Integer.parseInt(origval)) + revval;
        
        String sumString = String.valueOf(sum);
        //Check if string equal
        StringBuilder origsum = new StringBuilder(sumString);
        
        String test = (origsum.reverse()).toString();
        int revsum = Integer.parseInt(test);
        
        //If palindrome found
        if( sum == revsum ) {
            System.out.println(origsum);
            return;
        }else {
            String nextval = origsum.toString();         //Else Start again
            identifyPalindrome(nextval);
        }        
    }
}