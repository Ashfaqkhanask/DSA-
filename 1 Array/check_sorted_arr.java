public class check_sorted_arr {
    public static int checksort(int arr[]){
        int m=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    m+=1;
                    break;
                }
            }
        }
        if(m>0){
            System.out.println("The Array is NOT SORTED");
        }
        else{
            System.out.println("The Array is Sorted");
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a={3,5,7,8,9,1};
        checksort(a);

    }
    
}
