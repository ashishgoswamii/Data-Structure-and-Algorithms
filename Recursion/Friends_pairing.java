/*
    1. Given a string consisting of distinct friends.
    2. Each frnd can either stay single or be in a pair with someone.
    3. Print all the possible ways all the friends can group up
*/

public class Friends_pairing {
    public static void main(String args[]){
        String frns = "1234";
        frndpairs(frns,"");
    }   
    
    public static void frndpairs(String frnds, String ans){
        if(frnds.length() == 0){
            System.out.println(ans.substring(0,ans.length()-1 ));
            return;
        }

        char currChar = frnds.charAt(0);
        frndpairs(frnds.substring(1), ans + currChar +"-");

        for(int i=1; i<frnds.length();i++){
            char currchar2 = frnds.charAt(i);
            String remfrnds = frnds.substring(1, i) + frnds.substring(i+1);
            frndpairs(remfrnds, ans + currChar+currchar2+ "-");
        }
        
    }   
}    
