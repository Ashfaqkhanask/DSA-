public class sumOfDigits {
    public static int sumDigits(int n){
        if (n==0){
            return 0;
        }
        return n%10+sumDigits(n/10);
    }
    public static void main(String[] args) {
        int n=3452;
        System.out.println(sumDigits(n));
    }
}
