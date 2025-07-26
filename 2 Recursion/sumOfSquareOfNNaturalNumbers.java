public class sumOfSquareOfNNaturalNumbers {
    public static int sumOfSquares(int n){
        if(n==1){
            return 1;
        }
        return (n*n)+sumOfSquares(n-1);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(sumOfSquares(n));
    }
}
