public class duplicatesInArray {
    public static void main(String[] args) {
        int a[]={1,1,1,2,2,3,4,5,5,7,7,7};
        // int temp=a[0];
        for (int i = 0; i < a.length-1; i++) {
            if ((i>0)&&(a[i]==a[i-1])) {
                continue;
            }
            if (a[i]==a[i+1]) {
                System.out.println(a[i]);
            }
        }
    }
}
