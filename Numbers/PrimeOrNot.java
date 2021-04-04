//Problems related to Prime Number Logic

public class PrimeOrNot {
    public static void main(String args[]) {
        int number = 101;
        isPrime(number);
    }

    //Checks if num is prime
    static void isPrime(int num) {
        for(int div = 2 ; div*div <= num ; div++) { 
            /* 1.No of Factors of prime number = 1 and the number itself.
               2.As we are concerned only about no of factors and no of factors we check
                 if there is any other factor between 2 and sqrt of number  
               3.If(Other factor Exists) --> Not Prime 
                 Else (Prime). 
            */
            if( num % div == 0 ) {                       //This will be true if other factor exists.
                System.out.println("Not Prime");
                return ;
            }
        }
        System.out.println("Prime");
    }

}

