public class chkPowerOfTwo{
    public static void main(String[] args){
        int n=1078;
        System.out.println(chkPower(n));
    }
    public static boolean chkPower(int n){
        int result=n&(n-1);
        if (result==0) {
            return true;
        }
        else{
            return false;
        }
    }
}