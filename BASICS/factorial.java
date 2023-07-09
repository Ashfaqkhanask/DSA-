package BASICS;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. : "); 
        int fa= sc.nextInt();
        int n=fa;
        for(int i=1;i<fa;i++){
            fa*=i;
            System.out.print("f becomes"+fa); 
        }
        System.out.print("The factorial of "+n+" is : "+fa); 
    }
}
