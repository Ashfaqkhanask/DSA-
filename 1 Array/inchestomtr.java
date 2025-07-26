import java.util.Scanner;

public class inchestomtr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : "); 
        int i= sc.nextInt();
        double m= (2.54*i)/100; 
        System.out.println(i+" inches = "+m+" m");
    }
    
}
