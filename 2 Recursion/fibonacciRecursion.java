public class fibonacciRecursion {
    public static void main(String[] args) {
        int n=5;
        int c1=0;
        int c2=0;
        System.out.println(fib(n,c1,c2));
    }
    public static int fib(int n,int c1,int c2){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f1=fib(n-1,c1+1,c2);
        // System.out.println("f1 :"+n+" c1 : "+c1);
        int f2=fib(n-2,c1,c2+1);
        // System.out.println("f2 :"+n+" c2 : "+c2);
        return f1+f2;

        // BETTER METHOD
    //     if (n <= 1) {
    //         return n; // base cases: fib(0) = 0, fib(1) = 1
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
    // }
    }
}
