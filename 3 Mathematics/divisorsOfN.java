public class divisorsOfN {
    public static void main(String[] args) {
        int n = 36;
        // printDivisors(n);
        printSortedDivisors(n);
    }

    public static void printSortedDivisors(int n) {
        int i = 1;
        for (; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        i--;
        for (; i >= 1; i--) {
            if (n % i == 0) {
                if (n / i != i)
                    System.out.println(n / i);
            }
        }
    }

    public static void printDivisors(int n) {
        if (n == 0) {
            System.out.println("No divisiors found");
        }
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (n / i != i)
                    System.out.println(n / i);// if we do this same in curly braces it will not give desired output
            }
        }
    }
}
