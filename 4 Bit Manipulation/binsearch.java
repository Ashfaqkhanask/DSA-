public class binsearch{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int target=0;
        int start=0;
        int end=a.length-1;
        int f=1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==target){
                f=2;
                System.out.println("Target found");
                break;
            }
            if(a[mid]>target){
                end=mid-1;
            }
            if(a[mid]<target){
                start=mid+1;
            }
        }
        if (f!=2) {
            System.out.println("Target Not found");
        }
    }
}
