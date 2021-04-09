/*
    1. Given a number n which represents length of road  .
    2. The road has n plots on both sides of it.
    3. You have to print the number of arrangements that are possible.
    4. No two buildings can occur consecutively, you can leave space if you want by not selecting building.
*/


public class Arrange_Buildings{
    public static void main(String args[]) {
        int n = 3;
        arrangeBuildings(n);
    }

    public static void arrangeBuildings(int n) {

        //After each step we will have arrangements ending with bulding in the end without violating rules
        //And buildngs ending with space. 
    
        int endingB = 1;     //Stores number of arrangements of n=1 ending with building in the end
        int endingS = 1;     //Stores number of arrangements of n=1 ending with space in the end
  

        //Iterate n times as size of road is n.  
        for (int i=2; i<=n; i++) {
            int newendB = endingS;            //Only space can be added after building ending with building
            int newendS = endingB + endingS;   //Space can be added after both buildings ending with building and space
  
            endingB =newendB;
            endingS =newendS;
        }
        int side1 = endingB + endingS;
        int total = side1*side1;       //Square the value as arrangements are asked for each value in lane one other lane can have all combinations
        System.out.println(total);
    }
}