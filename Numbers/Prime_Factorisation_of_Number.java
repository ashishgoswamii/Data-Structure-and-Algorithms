public class Prime_Factorisation_of_Number {

    //Print the prime factorisation of a given number.

    public static void main(String[] args) {
      int number = 83;
      int limit = number;
      
      //Use limit here as number will change after division.
      for(int i = 2 ; i*i <= limit ; ) {
        //If factor found --> Print factor --> Update number. 
        while( number % i == 0) {
            System.out.print(i + " ");
            number = number/i;
        }
        i++;
      }
    //   If number could not be divided completely then a prime factor is left. Print it.
      if(number != 1) {
          System.out.print(number);
      }     
    }    
}
