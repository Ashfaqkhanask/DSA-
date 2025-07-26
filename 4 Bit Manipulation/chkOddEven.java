public class chkOddEven {
    public static void main(String[] args) {
        int n=14;
        // System.out.println(check(n));
        check(n);
    }
    public static void check(int n){
        if ((n&1)==1) {
            System.out.println("odd");
            // return true;
        }
        else{
            System.out.println("Even");
            // return false;
        }
    }
}
