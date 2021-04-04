public class N_Fibonacci_Numbers {

  public static void main(String[] args) {
      // write your code here
      int n = 10;
      int num1 = 0;
      int num2 = 1;
      if(n > 0) {                            // If 1 is passed
          System.out.println(num1);
      }
      if(n > 1) {                              // If 2 is passed
          System.out.println(num2);          
      }
      
      //Iterating n-2 times as 2 others are already printed
      for(int i = 0 ; i < n - 2 ; i++) {
        int temp = num2;
        num2 = num2+num1;
        num1 = temp;
        System.out.println(num2);      
      }
   }
}
