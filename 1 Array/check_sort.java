import java.util.Scanner;
public class check_sort {
    public static int chksort(int arr[],int c){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                c+=1;
                System.out.println("Array is not Sorted");
                break;
            }
            else if(i==arr.length-1){
                System.out.println("Array sorted");
            }
            else{continue;}
        }
        if(c==0){
            System.out.println("Array Sorted");
        }
        return 0;
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,6,7};
        int c=0;
        System.out.println(chksort(a,c));
    }
}