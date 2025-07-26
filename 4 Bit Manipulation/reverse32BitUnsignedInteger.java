public class reverse32BitUnsignedInteger {
    public static void main(String[] args) {
        long n=3;
        long res=0;
        int i=0;
        while (i<=31) {
            if ((n&(1<<i)) !=0) {
                res+=(1L<<(31-i));
            }
            i++;
        }
        System.out.println(res);
    }
}