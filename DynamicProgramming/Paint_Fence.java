/*
   1. Given n houses and k colors.
   2. Find in how many ways can we color n houses such that no two consecutive houses have 
    the same color.
*/

public class Paint_Fence {
    public static void main(String args[]){
        int n = 8;
        int k = 3;
        paintWays(n, k);
    }

    public static void paintWays(int n, int k){

        int ltsc = k;                    //Last two houses with same paint
        int ltdc = k*(k-1);              //Last two houses with different paint

        for(int i=3 ; i<=n ; i++){
            int newltsc = ltdc;
            int newltdc = (ltdc + ltsc)*(k-1);
            ltsc = newltsc;
            ltdc = newltdc;
        }
        int totalways = ltsc + ltdc;
        System.out.println(totalways);
    }
}
