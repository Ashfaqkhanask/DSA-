public class longestlength_allconsecutive1s {
    public static int maxlen(int a[]){
        int c=0;
        int max=0;
        for(int j:a){
            if(j==1){
                c+=1;
                if (max<c) {
                    max=c;
                }
            }
            else{
                c=0;
                continue;
            }
        }

        //MY 1st METHOD both are same method  :
        
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==1){
        //         c+=1;
        //     }
        //     if(a[i]!=1){
        //         c=0;
        //     }
        //     if(c>max){
        //         max=c;
        //     }
        // }
        System.out.println("longest length of all consecutive 1's : "+max);
        return max;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,1,0,0,1,1,1,1,1,0,1,1,1,1,0,1};
        System.out.println(maxlen(a));
    }
}
