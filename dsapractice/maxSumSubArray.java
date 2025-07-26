public class maxSumSubArray {
    public static void main(String[] args) {
        int a[]={-2,-1,-3,-4,-1,-2,-1,-5,-4};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if (maxSum<sum) {
                maxSum=sum;
            }
            if (sum<0) {
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
