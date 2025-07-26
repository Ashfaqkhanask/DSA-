import java.util.Scanner;

public class largst_arr {
    public static int largst(int arr[],int max){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;//max contains the index of largest element
            }
        }
        System.out.println("Largest Element is : "+arr[max]);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a[]={-12,-44,-6,-5,-56,-8};
        int max=0;
        largst(a,max);
        System.out.println("Largest Element is : "+a[max]);
    }
    
}
