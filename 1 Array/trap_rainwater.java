public class trap_rainwater {
    public static int area_trapped(int a[]){
        if (a == null || a.length < 3) {
            return 0;
        }
        int n=a.length;
        int[] l=new int[n];
        int[] r=new int[n];
        l[0]=a[0];
        r[n-1]=a[n-1];
        int totalwater=0;
        for(int i=1;i<a.length;i++){//int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
            l[i]=Math.max(l[i-1],a[i]);
        }
        System.out.println();
        for(int j=n-2;j>-1;j--){
            r[j]=Math.max(r[j+1],a[j]);
        }
        for(int k=0;k<n;k++){
            totalwater+=Math.min(l[k],r[k])-a[k];
        }
        // 2 point approach
        //int totalwater=0;
        // int l=0;
        // int r=a.length-1;
        // int lmax=0;
        // int rmax=0;
        // while (l<r) {
        //     if (a[l] < a[r]) {
        //         // If the height at left pointer is less than right pointer
        //         if (a[l] >= lmax) {
        //             lmax = a[l]; // Update the left maximum
        //         } else {
        //             // Calculate trapped water
        //             totalwater += lmax - a[l];
        //         }
        //         l++; // Move left pointer to the right
        //     } else {
        //         // If the height at right pointer is less than or equal to left pointer
        //         if (a[r] >= rmax) {
        //             rmax = a[r]; // Update the right maximum
        //         } else {
        //             // Calculate trapped water
        //             totalwater += rmax - a[r];
        //         }
        //         r--; // Move right pointer to the left
        //     }
        // }
        // System.out.println(totalwater);
        return totalwater;
    }
    public static void main(String[] args) {
        int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(area_trapped(a));
    }
}
