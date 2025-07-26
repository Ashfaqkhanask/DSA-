import java.util.Scanner;
public class del_frm_array {
    public static int delete(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
            //anuj bhaiya :
            //for(int i=0;i<arr.length;i++){
            //  if(arr[i]==key){
            //      break;}
            //}
            //for(int j=i;j<arr.length-1;j++){
            //  arr[j]=arr[j+1];}
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a[]={12,44,6,5,56,78};
        int k;
        System.out.println("Enter key : ");
        k=sc.nextInt();
        delete(a, k);
        for(int e:a){
            System.out.print(e+" ");
        }
        
    }
}
