
import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Before Swapping : "); 
        System.out.print("\nEnter 1st number : "); 
        int a= sc.nextInt();
        System.out.print("\nEnter 2nd number : "); 
        int b= sc.nextInt();
        int s;
        s=a;
        a=b;
        b=s;
        System.out.print("\nAfter Swapping : ");
        System.out.print("\nThe 1st no. is : "+a+"\nThe 2nd no. is : "+b); 
 

    }
}