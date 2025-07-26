public class XORupToN {
    public static void main(String[] args) {
        int n=2;
        int c=1;
        for(int i=2;i<n+1;i++){
            c^=i;
        }
        System.out.println(c);
    }
}
