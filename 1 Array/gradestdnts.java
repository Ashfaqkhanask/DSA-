
import java.util.Scanner;

public class gradestdnts {
    //2 methods:  1)if else 2)switch case
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int m =sc.nextInt();
        switch (m) {
            case 90:
                System.out.println("A+ Grade");
                break;
            case 80:
                System.out.println("A Grade");
                break;
            case 70:
                System.out.println("B+ Grade");
                break;
            case 60:
                System.out.println("B Grade");
                break;
        
            default:
                break;
        }
        if(m>90){
        System.out.println("A+");
        }
        else if(m>70){
        System.out.println("A");
        }
        else{
        System.out.println("B");

        }
    }
}
