import java.util.Arrays;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 23;
        sieveOfEratosthenesPrimes(n);
    }

    public static void sieveOfEratosthenesPrimes(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Mark all numbers as prime initially

        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as false starting from i * i
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
        public static void printPrimes(int p){
        for (int i = 2; i < p; i++) {
            // is(isPrimeMoreEfficient(i));{System.out.println(i);}
        }
    }
}

// import java.util.Arrays;

// public class sieveOfEratosthenes {
//     public static void main(String[] args) {
//         int n=11;
//         // printPrimes(n);
//         sieveOfEratosthenesPrmes(n);
//     }
//     public static void sieveOfEratosthenesPrmes(int n){
//         boolean isPrime[]=new boolean[n+1];
//         Arrays.fill(isPrime,true);
//         for(int i=0;i*i<=n;i++){
//             if(isPrime[i]){
//                 for(int j=2*i;j<=n;j+=i){
//                     isPrime[j]=false;
//                 }
//             }
//         }
//         for (int i = 2; i <=n; i++) {
//             if(isPrime[i]) System.out.println(i);
//         }
//     }
//     // public static void printPrimes(int p){
//     //     for (int i = 2; i < p; i++) {
//     //         // is(isPrimeMoreEfficient(i));{System.out.println(i);}
//     //     }
//     // }
// }