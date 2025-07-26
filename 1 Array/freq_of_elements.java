import java.util.Scanner;
public class freq_of_elements {
    public static int frequency(int a[]){
        int n=a.length;
        int f=1;
        int max=0;
        int MajorityElementIndex=0;
        for(int i=1;i<n;i++){//int[] a={1,1,2,3,3,3,4,4};
            if(a[i]==a[i-1]){
                f++;
                // System.out.println("frequency of "+a[i-1]+" "+f);
                continue;
            }
            else{
                if (max<f) {
                    MajorityElementIndex=i-1;
                    max=f;
                }
                max=Math.max(max, f);
                System.out.println("frequency of "+a[i-1]+" "+f);
                f=1;
            }
        }
        System.out.println("frequency of "+a[n-1]+" "+f);
        System.out.println("Majority Element Is : "+a[MajorityElementIndex]+"\nFrequency Of Majority Element Is : "+max);
        return 0;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter length of array : ");
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        int[] a={1,1,2,3,3,3,4,4,5,6};
        frequency(a);
    }
}
