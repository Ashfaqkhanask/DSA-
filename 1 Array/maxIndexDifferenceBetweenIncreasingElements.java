public class maxIndexDifferenceBetweenIncreasingElements {
    public static int maxDifference(int a[]){
        int n=a.length;
        int left=0;
        int right=a.length-1;
        int maxDifference=0;
        //      ANUJ BHAIYA ( METHOD 1 ) A BIT LONG :
        int []lmin=new int[n];
        int []rmax=new int[n];
        rmax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1], a[i]);
        }
        lmin[0]=a[0];
        for(int i=1;i<n;i++){
            lmin[i]=Math.min(lmin[i-1], a[i]);
        }
        int i=0;
        int j=0;
        int ans=0;
        while (i<n && j<n) {
            if (lmin[i]<rmax[j]) {
                ans=Math.max(ans,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
        //          MY EASY AND NICE METHOD(2 POINTER APPROACH)

        // while (left<right) {        //a[]={3,4,5,1,7,2,6,5,4,1};
        //     if (a[left]<a[right]) {
        //         maxDifference=Math.max(right-left, maxDifference);
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // if (maxDifference>0) {
        //     return maxDifference;
        // }
        // else{
        //     return-1;
        // }
    }
    public static void main(String[] args) {
        // int a[]={3,4,5,1,7,2,6,5,4,1};
        int a[]={4,3,5,1,4,2,1};
        System.out.println(maxDifference(a));
    }
}
