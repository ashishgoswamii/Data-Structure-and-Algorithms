public class Inverse_of_Number {
  
/* A number is given of length N.
   Each digit will be in range of 1 - N and no digit will be skipped.
   Inverse the number by interchanging their index and value.
   Assume index is from 1 and starts from right.
   Use of data structures is not allowed.
*/

    public static void main(String[] args) {
      // write your code here 
      int num = 13254;
      int finalno = 0;
      int place = 1;
      
      while(num > 0) {
          int digit = num % 10;
          num = num /10;
          int temp = place * (int)(Math.pow(10,digit - 1));
          finalno += temp;
          place++;
      }
      System.out.println(finalno);     
    }
}
