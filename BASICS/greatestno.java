package BASICS;

import java.util.Scanner;

public class greatestno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : "); 
        int a= sc.nextInt();
        System.out.println("Enter 2nd number : "); 
        int b= sc.nextInt();
        System.out.println("Enter 3rd number : "); 
        int c= sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("The Greatest No. is : "+a); 
            }
        }if(b>c){
            if(b>a){
                System.out.println("The Greatest No. is : "+b); 
            }
        }
        if(c>a){
            if(c>b){
                System.out.println("The Greatest No. is : "+c); 
            }
        }
        int[] arr={a,b,c};
        int s=0;
        int t;
        for(int i=0;i<arr.length;i++){
            if(i==arr[-1]){
                if(arr[-1]>arr[0]){
                    t=arr[0];
                    arr[0]=arr[-1];
                    arr[-1]=t;
                }
                break;
            }
            else if(arr[i+1]>arr[i]){
                t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
            s+=arr[i];
        }
        System.out.println("The Greatest no. is : "+arr[0]);
        System.out.println("The Sum is : "+s);
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
