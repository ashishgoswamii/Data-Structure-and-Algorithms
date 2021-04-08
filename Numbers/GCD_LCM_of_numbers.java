public class GCD_LCM_of_numbers {
    public static void main(String args[]) {
        int n1 = 16;
        int n2 = 32;
        GCDbetter(n1,n2);
    }


    public static void GCDbetter(int n1, int n2) {
        int divident = n1;
        int divisor = n2;

        while(divident % divisor != 0) {
            int remainder = divident % divisor;
            divident = divisor;
            divisor = remainder;
        }
        System.out.println(divisor);
    }


    public static void GCDslow(int n1, int n2) {

        int hcf = 0;
        if(n1%n2 ==0){
            hcf = n2;
        }else if(n2%n1 == 0){
            hcf = n1;
        }
        else {
            int min = Math.min(n1,n2);
            min = min/2;

            for(int i=min; i>=1; i--) {
                if( n1 % i ==0 && n2 % i ==0) {
                    hcf=i;
                    break;
                }
            }
        }
        int lcm = (n1*n2)/(hcf);
        System.out.println(hcf);
        System.out.println(lcm);
    }
}
