
import java.util.Scanner;

public class areaperimtr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius of Circle : "); 
        int r= sc.nextInt();
        double ar=Math.PI*r*r;
        double pe=2*3.14*r;
        System.out.println("The Area & perimeter of circle of radius "+r+" is : "+ar+" & "+pe);  
    }
    
}
