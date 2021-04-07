/*
    Given two arrays, Print their intersection.
*/
import java.util.HashMap;
public class Intersection_of_Arrays {
    public static void main(String args[]) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,4,5};
        printIntersection(a1,a2);
        
    }        

    public static void printIntersection(int[] a1,int[] a2) {
        HashMap<Integer,Integer> hashy = new HashMap<>();
        //Put array1 in hashmap along with frequency of each number.
        for(int i=0; i<a1.length; i++) {
            int curr = a1[i];
            if(hashy.containsKey(curr)) {
                int oldv = hashy.get(curr);
                hashy.put(curr,oldv+1);
            }else {
                hashy.put(curr,1);
            }
        }

        //Check for each element of array2 if that element exists in hashmap.
        //If true print it, else do nothing.
        for(int i=0; i<a2.length; i++) {
            int curr = a2[i];
            if(hashy.containsKey(curr)){
                int oldv = hashy.get(curr);
                if(oldv == 1) {
                    hashy.remove(curr);
                }else {
                    hashy.put(curr, oldv-1);
                }
                System.out.print(curr + " " );
            }
        }
    }
}