import java.util.*;
public class trailingZeroes {
    //
    public static void main(String[] args){
        int fact;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number : ");
        fact=sc.nextInt();
        int os=0;
        while(fact>0){
            if (fact%5==0) {
                os+=fact/5;
                fact=fact/5;
            }
            else{
                fact=fact-fact%5;
            }
        }
        System.out.println("Number Of Trailing 0s : "+os);
    }
}
