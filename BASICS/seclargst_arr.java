import java.util.Scanner;

public class seclargst_arr {
    public static int seclargst(int arr[],int max,int temp){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                temp=max;
                max=i;
            }
        }
        System.out.println("The 2nd Largest Element is : "+arr[temp]+" and largest is : "+arr[max]);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a[]={12,12,8,23,44,6,5,56,8};
        int max=0;
        int t=0;
        seclargst(a,max,t);
    }
    
}
