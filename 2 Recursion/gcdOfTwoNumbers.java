public class gcdOfTwoNumbers {
    public static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a=17;
        int b=34;
        System.out.print("The GCD Of "+a+" and "+b+" : ");
        System.out.println(gcd(a,b));
    }
}
