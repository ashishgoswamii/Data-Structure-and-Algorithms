import java.lang.Math;
    
    public class Digits_of_Number{
        
    public static void main(String[] args) {
      // write your code here  
    //   Scanner scn = new Scanner(System.in);
    int num = 1000;
    
    int digits = 0;
    int n = num;
    while(n > 0){
        n = n/10;
        digits++;
    }
    
    int power = (int)Math.pow(10, digits -1);
    int counter = 0;
    while(counter < digits  ) {
        int currdig = num / power;
        num = num % power;
        power = power /10;
        System.out.println(currdig);
        counter++;
    }
                   
    }
}