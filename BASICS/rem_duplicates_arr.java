public class rem_duplicates_arr {
    public static int rem_duplicates(int arr[]){
        int n=arr.length;
        int j=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                arr[j]=arr[i+1];
                j++;
            }
        }

    return j;
    }
    public static void main(String[] args){
        int a[]={1,1,2,2,2,3,4,4,7,7};//Note : Array should be "SORTED" 
        
        rem_duplicates(a);
        for(int e:a){
            System.out.print(e+" ");
        }

    }
}
      //NOT WORKING :
        // for(int i =0;i<n;i++){
        //     for(int m=i+1;m<n;m++){
        //         if(arr[i]==arr[m]){
        //             for(int k=m;k<n-1;k++){
        //                 arr[k]=arr[k+1];
        //             }
        //         }
        //     }
        // }
          
    //     int j=0;int i=0;
    //     arr[j]=arr[i];
    //     for(;i<arr.length;i++){
    //         if(arr[i]!=arr[j]){
    //             arr[j+1]=arr[i];
    //             j++;
    //         }
    //     }
        
    //     System.out.println()