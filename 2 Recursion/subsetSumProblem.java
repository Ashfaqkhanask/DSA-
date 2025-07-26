public class subsetSumProblem {
    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 27;
        System.out.println(chkSum(set, set.length, sum));
    }
    public static boolean chkSum(int [] set,int n,int sum){
        if (sum==0) {
            return true;
        }
        if (n==0&&sum!=0) {//If no elements left and sum is not 0, then no subset can be found
            return false;
        }
        if (set[n-1]>sum) { // If last element is greater than sum, ignore it
            chkSum(set, n-1, sum);
        }
        // Otherwise, check if sum can be obtained by either:
        // (1) including the last element or(2) excluding the last element
        return chkSum(set, n-1, sum) || chkSum(set, n-1, sum-set[n-1]);
    }







}
