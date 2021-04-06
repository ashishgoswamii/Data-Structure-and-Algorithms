/*
    We need to find no of paths available if we are going down stairs.
    We can jump by 1,2,3 at a time.
    Print total no of paths that are available from the current stair we are standing at 
    to reach the 0th stair. 
*/

public class Find_No_of_Paths {
    public static void main(String args[]) {
        int standingatstair = 5;
        int paths = 0;
        //Edge case if user inputs 0 or negative value
        if (standingatstair > 0) {          
            //We will use this as memoziation table
            int[] pathsKnown = new int[standingatstair + 1];
            paths = countPaths(standingatstair,pathsKnown);
        }
        System.out.println("Total paths from " + standingatstair + "th stair to 0th :" + paths);

    }

    //Finds paths available and returns int value
    public static int countPaths(int currentstair,int[] PathsKnown) {
        if(currentstair < 0) {                          //Overshot stairs
            return 0;
        }else if( PathsKnown[currentstair] != 0 ){      //Value already known
            return PathsKnown[currentstair];
        }else if ( currentstair == 0) {                 
            return 1;
        }

        int p1 = countPaths(currentstair - 1, PathsKnown);
        int p2 = countPaths(currentstair - 2, PathsKnown);
        int p3 = countPaths(currentstair - 3, PathsKnown);
        int totalpaths = p1 + p2 + p3;                   
        PathsKnown[currentstair] = totalpaths;
        return totalpaths;
        
    }
    
}