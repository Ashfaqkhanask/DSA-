
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Terms : "); 
        int n= sc.nextInt();
        int a=0;int b=1;
        int c;
        System.out.print("\nFibonacci Series is : "+a+" "+b); 
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c); 
        } 
    }
}
