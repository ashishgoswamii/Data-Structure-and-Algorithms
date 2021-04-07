/*
    You are standing at 0th stair .
    N will be given, meaning the stair we have to reach.
    An array of size N-1 will be given. Which will contain the maximum size of jump
    which is allowed for each stair from 0th stair to N-1th stair .
    Find the minumum jumps in which we can reach the Nth stair. 
*/


//I'm using DP Tabulation method here. Same can be done by memoziation as well.
//To memoize your solution just find a recursize logic and build a cache around that.


public class Climb_stair_with_minimum_moves {
    public static void main(String args[]) {
        int[] steps = {1,3,0,2,1,3};
        minimumMoves(steps,6);
    }

    public static void minimumMoves(int[] steps,int targetstair){

        //Cache will store the Minimum number of moves from i'th Stair to nth stair. 
        // 0 1 2 3 4 5 6
        //As n is 6 the minimum moves required to reach 6-6 is 0;
        //Rest we will find out as we solve our cache.
        
        Integer Cache[] = new Integer[7];
        Cache[targetstair] = 0;


        for(int i=targetstair-1;  i>=0 ;   i--) {           //Loop for stairs
            int minmoves = Integer.MAX_VALUE;            
            for(int j=1 ;j<=steps[i] && i+j < Cache.length ; j++) {             //Loop for size of jump allowed from each stair
                if(Cache[i+j] != null ) {
                    minmoves = Math.min(minmoves,Cache[i+j]);
                }
            }
            if( minmoves != Integer.MAX_VALUE) {
                Cache[i] = minmoves+1;
            }
        }
        System.out.println(Cache[0]);
    }
}
