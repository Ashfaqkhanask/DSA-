public class isPrime {
    public static void main(String[] args) {
        int n=7;
        System.out.println(chkPrime(n));
        System.out.println(chkPrimeEfficient(3));
        System.out.println(chkPrimeMoreEfficient(3));
    }
    public static boolean chkPrime(int n){
        if (n==1) {
            return false;
        }
        for(int i=2;i<n/2;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean chkPrimeEfficient(int n){
        if (n==1) {
            return false;
        }
        for(int i=2;i*i<n;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean chkPrimeMoreEfficient(int n){
        if (n==1) {
            return false;
        }
        if (n==2||n==3) {
            return true;
        }
        if (n%2==0||n%3==0) {
            return false;
        }
        for(int i=5;i<n/2;i+=6){
            if (n%i==0||n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
}
