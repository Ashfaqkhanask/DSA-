public class setIthBitTo1 {
    public static void main(String[] args) {
        int n=16;
        int i=2;
        int mask=1<<i;
        if ((n&mask)==0) {
            n|=mask;
        }
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
    }
}
