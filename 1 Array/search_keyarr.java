import java.util.Scanner;
public class search_keyarr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int key;
        int res=-1;
        int c=0;
        System.out.println("Enter the Key : ");
        key = sc.nextInt();
        int[] arr={4,78,8,23,9};
        for(int i=0;i<arr.length;i++){
            c+=1;
            if(arr[i]==key){
                res=i;
                System.out.println("The key "+key+" found at index "+i);
                break;
            }
        }
        if(res==-1){
            System.out.print("Key Not Found ");
        }
        else{
            System.out.print("Key "+key+" Found at index : "+res);
        }
        
    }
}
