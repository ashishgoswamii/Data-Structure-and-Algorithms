// Leetcode 11

public class Container_with_most_water {
    public static void main(String args[]) {
        int[] height = {4,5,3,4,2,6};
        int maxArea = maxArea(height);
        System.out.println(maxArea);
    }

    public static int maxArea(int[] height) {
        int fi = 0;
        int li = height.length-1;
        int maxArea = Math.min(height[fi],height[li]) * (li - fi);
        
        
        int tfi = fi;
        int tli = li;

        while(tfi < tli) {
            
            if( (Math.min(height[tfi],height[tli]) * (tli-tfi) ) > maxArea) {
                fi = tfi;
                li = tli;
                maxArea = Math.min(height[tfi],height[tli]) * (tli-tfi);
            }
             
            if(height[tfi] < height[tli]) {
                tfi++;
            }else {
                tli--;
            }
        }
        return maxArea;
    }
}
