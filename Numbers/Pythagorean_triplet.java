public class Pythagorean_triplet{
    public static void main(String args[]) {
        int n1 = 4;
        int n2 = 3;
        int n3 = 5;
        isPythagorean(n1, n2, n3);
    }

    public static void isPythagorean(int n1,int n2,int n3) {
        int largest = 0,small1 =0,small2 =0;
        if(n1 > n2) {
            if(n1 > n3){
                largest = n1;
                small1 = n2;
                small2 = n3;
            }
            
        }else if( n2 > n3) {
            largest = n2;
            small1 = n1;
            small2 = n3;
        }else {
            largest = n3;
            small1 = n1;
            small2 = n2;
        }
        if(largest*largest == small1*small1 + small2*small2 )
        {
            System.out.println("true");
        }else {
            System.out.println("false");            
        }
    }
}