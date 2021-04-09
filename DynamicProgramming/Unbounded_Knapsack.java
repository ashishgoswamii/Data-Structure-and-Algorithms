/*
    We have a bag whose capacity to carry weight is c.
    We have some elements with their value and their respective weights.
    We have to maximise the value of bag without violating it's weight c.
    Each element can be used as many times we want or not at all .
*/


public class Unbounded_Knapsack{
    public static void main(String args[]) {
        int[] weight = {2,5,1,3,4};
        int[] value = {15,14,10,45,30};
        int capacity = 7;
        fillKnapsack(weight,value,capacity);
    }

    public static void fillKnapsack(int[] weight, int[] value, int capacity ) {

        //Stores the max value for each weight. 0 - 7
        int cache[] = new int[capacity +1 ];
        cache[0] = 0;                // At 0 weight max value is 0

        for(int i=0 ; i<weight.length; i++) {
            for(int j=1; j<capacity+1; j++) {
                
                if(j >= weight[i]) {
                    int remweight = j-weight[i];
                    cache[j] = Math.max( cache[j],(cache[remweight] + value[i] ) );
                }
            }
        }
        System.out.println(cache[capacity]);

    }
}