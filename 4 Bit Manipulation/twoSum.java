public class twoSum{
    // public static boolean chkSum(int a[],int start,int end,int sum){
    //     while (start<end) {
    //         if (a[start]+a[end]==sum) {
    //             return true;
    //         }
    //         if (a[start]+a[end]>sum) {
    //             end--;
    //         }
    //         if (a[start]+a[end]<sum) {
    //             start++;
    //         }
    //     }
    //     return false;
    // }
    public static boolean toSum(int[] a,int sum){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                int tempSum = a[i]+a[j];
                System.out.println("tempSum = "+tempSum);
                if (tempSum == sum) {
                    System.out.println("found");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] a={2,3,7,8,10,12};
        int sum=19;
        System.out.println(toSum(a, sum));
        // System.out.println(chkSum(a,0,a.length-1,sum));
    }
}
