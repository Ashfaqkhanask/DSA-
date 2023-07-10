package BASICS;

import java.util.Scanner;

public class greatestno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : "); 
        int a= sc.nextInt();
        System.out.print("\nEnter 2nd number : "); 
        int b= sc.nextInt();
        System.out.print("\nEnter 3rd number : "); 
        int c= sc.nextInt();
        // // if(a>b){
        //     if(a>c){
        //         System.out.print("\nThe Greatest No. is : "+a); 
        //     }
        // }if(b>c){
        //     if(b>a){
        //         System.out.print("\nThe Greatest No. is : "+b); 
        //     }
        // }
        // if(c>a){
        //     if(c>b){
        //         System.out.print("\nThe Greatest No. is : "+c); 
        //     }
        // }
        int[] arr={a,b,c};
        System.out.print("\nOriginal Array : "+(arr));
        int s=0;
        int t;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                if(arr[arr.length-1]>arr[0]){
                    t=arr[0];
                    arr[0]=arr[arr.length-1];
                    arr[arr.length-1]=t;
                    break;
                }
                break;
            }
            else if(arr[i+1]>arr[0]){
                t=arr[0];
                arr[0]=arr[i+1];
                arr[i+1]=t;
            }
        System.out.print("\nUpdated Array is : "+arr);
        }
        System.out.print("\nThe Greatest no. is : "+arr[0]);
        System.out.print("\nThe Sum is : "+s);
        // FOR EACH STATEMENT :
        // for(int j:arr){
        //     if(j>=a){
        //         if(a>=b){
        //             System.out.println("The Greatest No. is : "+j);
        //         }
        //     }
        // }

    }
    
}
