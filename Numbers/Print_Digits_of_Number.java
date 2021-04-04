import java.lang.Math;
public class Print_Digits_of_Number {        

/* Print digits of a number form start to end using arithmetic.
   Without using any data structure or Strings.
   Example --> 1234.
   Output : 1
            2
            3
            4

*/

    public static void main(String[] args) {
        // write your code here  
        int num = 1234;

        //1.Use place value system and divide with appropriate power.
        //2.Print quotient and use remainder as next divident,decrease power.
        //3.Keep repeating till countofdigits.

        int countdigits = 0;
        int temp = num;
        while(temp > 0){
            temp = temp/10;
            countdigits++;
        }      
        int divisor = (int)Math.pow(10, countdigits -1);   
        int counter = 0;
        
        while(counter < countdigits  ) {
            int currdig = num / divisor;
            num = num % divisor;
            divisor = divisor /10;
            System.out.println(currdig);
            counter++;
        }
    }    
}
