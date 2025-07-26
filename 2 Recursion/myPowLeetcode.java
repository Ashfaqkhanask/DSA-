
///                 ERROR NOT WORKING

public class myPowLeetcode {
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n>0){
            if(n==1){
                return x;
            }
            return x*myPow(x,n-1);
        }
        else{
            if(n<0){

                return 1/n;
            }
            return (1/n)*myPow(x+1,n);
        }

    }
    public static void main(String[] args) {
        double x=2;
        int n=-2;
        System.out.println(myPow(x,n));
    }
}
