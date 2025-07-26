public class smallst_arr {
    public static int smallst(int arr[],int min){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        System.out.println("The Smallest Element is : "+arr[min]);
        return 0;
    }
    public static void main(String[] args){
        int[] a={4,6,3,8,32,7};
        int min=0;
        smallst(a,min);
    }
    
}
