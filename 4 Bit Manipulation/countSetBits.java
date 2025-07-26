public class countSetBits {
    public static void main(String[] args) {
        int n=10;
        System.out.println(count(n));
        System.out.println(countOptimized(n));
    }
    public static int count(int n){
        int count =0;
        while (n>0) {
            if ((n&1)==1) {
                count++;
            }
            n>>=1;
        }
        return count;
    }
    public static int countOptimized(int n){
        int count =0;
        while (n>0) {
            count++;
            n=n&n-1;
        }
        return count;
    }
}