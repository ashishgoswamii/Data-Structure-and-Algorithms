public class Rotate_Number_K_Times {
      
   public static void main(String[] args) {
        // write your code here  
        int num = 82301;
        int k = 3;        

        //Count No of Digits
        int digitcount = 0;
        int temp = num;
        while(temp > 0) {
            temp = temp/10;
            digitcount++;
        }

        //If rotations are greater than no of digits
        k = k % digitcount;

        //If negative rotations are given which mean rotations toward opposite side
        if(k < 0) {
            k += digitcount; 
        }
        int pow = (int)Math.pow(10,k);
        int firsthalf = num /pow;
        int secondhalf = num % pow; 
        int newsecond = secondhalf * (int)Math.pow(10,digitcount - k );
        int finalno = firsthalf + newsecond;
        System.out.println(finalno);

    }
}
