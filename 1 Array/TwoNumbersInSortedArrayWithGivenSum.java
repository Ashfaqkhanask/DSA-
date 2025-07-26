public class TwoNumbersInSortedArrayWithGivenSum {
    public static int[] twoSum(int a[],int givenSum){
        int l=0;
        int r=a.length-1;
        while (r>l) {
            int sum=a[l]+a[r];
            if (sum==givenSum) {
                return new int[] { l + 1, r + 1 };
            }
            else if (sum<givenSum) {
                l++;
            }
            else{
                r--;
            }
        }
        // SIMPLE METHOD BUT A LITTLE LENGTHY
        
        // while (r>l) { //a[]={1,2,7,8,10,12};
        //     if (a[l]+a[r]==givenSum) {
        //         System.out.println("index : ");
        //         System.out.println("["+(l+1)+","+(r+1)+"]");
        //         return 0;
        //     }
        //     else if (a[l+1]+a[r]==givenSum && l+1!=r) {
        //         System.out.println("Index : ");
        //         System.out.println("["+(l+2)+","+(r+1)+"]");
        //         return 0;
        //     }
        //     else if (a[l]+a[r-1]==givenSum && l!=r-1) {
        //         System.out.println("INDEX : ");
        //         System.out.println("["+(l+1)+","+r+"]");
        //         return 0;
        //     }
        //     else if (a[r]>givenSum) {
        //         l--;
        //         r--;
        //     }
        //     l++;
        //     r--;
        // }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int a[]={1,2,7,8,10,12};
        int givenSum=10;
        int[] result=twoSum(a, givenSum);
        // System.out.println(result);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
