public class ArrangeZeroes {
   public static void main(String args[]){
       int[] arr= {0,2,4,0,1,2,2,2};
       arrange(arr);
   } 

   public static  void arrange(int[] arr){
        int zpointer=0;
        int nzpointer=0;

        while(nzpointer < arr.length){
            while( zpointer<arr.length && arr[zpointer] != 0){
                zpointer++;
            }
            if(nzpointer < zpointer){
                nzpointer = zpointer+1;
            }
            while( nzpointer<arr.length && arr[nzpointer] == 0){
                nzpointer++;
            }
            if(nzpointer >= arr.length){
                break;
            }
            arr[zpointer] = arr[nzpointer];
            arr[nzpointer] = 0;
            zpointer++;
            nzpointer++;
        }

        for(int val : arr){
            System.out.print(val+"\t");
        }
   }
}
