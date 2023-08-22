public class rev_arr {
    public static int rev(int arr[]){
        int temp=0;
        int l=arr.length;
        if(l%2==0){
            for(int i=0;i<arr.length/2;i++){
                temp=arr[i];
                arr[i]=arr[l-1];
                arr[l-1]=temp;
                l--;
            }
            }
        else{
            for(int j=0;j<(arr.length-1)/2;j++){
                temp=arr[j];
                arr[j]=arr[l-1];
                arr[l-1]=temp;
            }
            l--;
        }
        for (int e : arr) {
            System.out.print(" "+e);
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a={4,6,3,8,32,7};
        rev(a);
    }
}
