/*
    Given an array of integers.
    Given a number K.
    You have to find out K largest elements from the array.
*/
import java.util.PriorityQueue;

public class K_largest_elements{
    public static void main(String args[]) {
        int[] arr = {100,50,80,20,60,80,20,30};
        int k=3;
        kLargest(arr, k);

    }

    public static void kLargest(int[] arr,int k ) {

        if(k <= 0){
            return;
        }
        if(k > arr.length ){
            System.out.println("K is bigger than array");
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k && i<arr.length; i++) {
            pq.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++) {
            if(arr[i] > pq.peek() ) {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        while( pq.size() > 0 ) {

            System.out.print(pq.remove() + "\t");
        }
    }
}