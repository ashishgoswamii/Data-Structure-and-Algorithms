/*
    1. Given a word.
    2. Print all abbrevations of that word  
    Sample input - pep
    Sample output - 
        pep
        pe1
        p1p
        p2
        1ep
        1e1
        2p
*/
public class Abbrevation{
        public static void main(String args[]){
            String word = "abc";
            findAbbrevations(word,0,0,"");
        }

    

    public static void findAbbrevations(String str,int index,int count, String asf){
        if(index == str.length()){
            if(count > 0){
                asf = asf + count;
            }
            System.out.println(asf);
            return;
        }


        if(count > 0){
            findAbbrevations(str, index+1, 0, asf + count + str.charAt(index) );
        }else {
            findAbbrevations(str, index+1, 0, asf + str.charAt(index));
        }
        findAbbrevations(str, index+1, count+1, asf);

    }
}