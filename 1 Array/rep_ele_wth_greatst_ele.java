public class rep_ele_wth_greatst_ele {
    public static int replace(int arr[],int max){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        for(int j=0;j<=max;j++){
            arr[j]=arr[max];
        }
        // for(int i=0;i<n;i++){
        //     max=i+1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[max]){
        //                 max=j;
        //             }
        //         arr[i]=arr[max];
        //         continue;
        //     }
        // }
        for(int e:arr){
            System.out.print(" "+e);
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a={3,5,9,8,7,5,3};
        int max=0;
        replace(a,max);
    }
    
}
