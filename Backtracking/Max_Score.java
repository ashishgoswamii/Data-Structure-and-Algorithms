public class Max_Score {
    static int[] val = 
    {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0 };
    static int max = 0;
    public static void main(String args[]) {
        String[] words = {"dog","cat","dad","good" };
        char[] character = 
            {'a','b','c','d','d','d','g','o','o'};

        int[] avlchr = new int[26];
        for(int i=0; i<character.length; i++){
            int index = character[i] - 'a';
            avlchr[index] += 1 ; 
        }
        maxScore(0,words,character,avlchr,0,"");
        System.out.println(max);
    }

    public static void maxScore(int index,String[] words, char[] character,int[] avlchr, int score,String ans){

        if(index == words.length) {
            System.out.println(ans+".");
            return;
        }

        maxScore(index+1, words, character, avlchr, score, ans);

        
        String currword = words[index];

        for(int i=0; i<currword.length();i++){
            int currChar = currword.charAt(i) - 'a' ;
            if( avlchr[currChar] > 0){
                avlchr[currChar] -= 1;  
                score += val[currChar];                  
            }else {
                i--;
                while(i>=0){
                    currChar = currword.charAt(i) - 'a' ;
                    avlchr[currChar] += 1; 
                    score -= val[currChar];                  
                    i--;            
                }
                return;
            }
        }
        
        maxScore(index+1, words, character, avlchr, score,ans + words[index]+ " ");
        if (score > max){
            max = score;
        } 

        for(int i=0; i<currword.length();i++){
            int currChar = currword.charAt(i) - 'a' ;
            avlchr[currChar] += 1;  
            score -= val[currChar];                     
            
        }
    
    }

}
