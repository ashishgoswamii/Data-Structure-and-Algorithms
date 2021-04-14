import java.util.PriorityQueue;

/*
    1.Given a K sorted array.
    2. Meaning every element in the array is at max displaced
       k positions to the right or left of it's optimal position.
    3. Sort the array and print it.
*/

public class Sort_K_sorted_array {  
    public static void main(String args[]) {
        int[] arr = {3,2,1,5,6,4};
        int k =2 ;
        kSort(arr, k);
    }

    public static void kSort(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++) {
            pq.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++) {
            if(arr[i] < pq.peek() ){
                System.out.print(arr[i] + "\t");
            }else {
                System.out.print(pq.remove()+ "\t");
                pq.add(arr[i]);
            }
        }

        while(pq.size()>0) {
            System.out.print(pq.remove() + "\t");
        }
    }
}
