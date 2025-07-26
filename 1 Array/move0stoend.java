public class move0stoend {
    public static int move(int a[]){
        int c=0;
        for(int i=0;i<a.length;i++){//a[]={8,0,1,3,0,0,5};
            if(a[i]!=0){
                a[c]=a[i];
                c+=1;
            }
        }
        for (int i = c; i < a.length; i++) {
            a[i] = 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[]={8,0,1,3,0,0,5};
        System.out.println(move(a));
        for (int j : a) {
            System.out.print(j+" ");
        }
    }
}
