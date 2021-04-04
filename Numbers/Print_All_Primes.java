public class Print_All_Primes{

    //Print all prime numbers between range both inclusive
    public static void main(String[] args) {
        int low = 2;
        int high = 20;
        for(int i = low ; i <= high ; i++ ){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    
    //Returns true if prime 
    static Boolean isPrime(int num ) {
        for(int div = 2 ; div*div <= num ; div++) {
            if(num % div == 0) {
                return false;
            }
        }
        return true;
    }
    
    
}