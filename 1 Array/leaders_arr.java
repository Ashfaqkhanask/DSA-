public class leaders_arr{
    public static int leaders(int arr[]){
        int c=0;
        int max=0;
        int n=arr.length;
        max=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[max]){
                max=i;
                System.out.print(" "+arr[max]);
            }
            // System.out.print(" "+arr[max]);
            
        }
        //arr=[2,7,6,1,4,3]
        // for(int i=0;i<n;i++){
        //     max=i;
        //     for(int j=i;j<n;j++){
        //         if(arr[i]<arr[j]){
        //             c+=1;
        //             continue;
        //         }
        //     }
        //     if(c==0){
        //         System.out.print(" "+arr[i]);
        //     }
        //     c=0;
        // }
        return 0;
    }
    public static void main(String[] args){
        int[] a={2,7,6,1,4,3};
        leaders(a);
    }
}