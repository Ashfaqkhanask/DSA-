// import java.util.Scanner;
public class rotateKStepsArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,3,5};
        int k=2;
        int n[]=new int[a.length];
        int l=0;
        for (int i = k; i < n.length; i++) {
            n[i]=a[l];
            l++;
        }

        //right
        int r=a.length-k;
        for (int j = 0; j < k; j++) {
            n[j]=a[r];
            r++;
        }
        System.out.println("");
        for (int i : n) {
            System.out.print(i+" ");
        }

    }
}
