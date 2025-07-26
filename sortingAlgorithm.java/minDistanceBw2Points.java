// NOTE : TOO FUCKING HARD

public class minDistanceBw2Points {
    public static void main(String[] args) {
        int arr[][] = {{-1,-2},{0,0}, {1, 2}, {2, 3}};
        minDistance(arr);
    }
    public static int minDistance(int [][] a){
        if (a.length==0) {
            return 0;
        }
        return dicAndConq(a,0,a.length-1);
    }
    public static int dicAndConq(int [][] a,int l,int r){
        if (l==r) {
            return 0;
        }
        int mid=(l+r)/2;
        return 0;
    }
}
