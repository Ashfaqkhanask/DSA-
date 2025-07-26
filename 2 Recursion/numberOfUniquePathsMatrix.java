public class numberOfUniquePathsMatrix {
    public static int uniquePaths(int m, int n) {
            if(n==1 || m==1){
                return 1;
            }
            int rightSideAns=uniquePaths(m,n-1);
            int downSideAns=uniquePaths(m-1,n);
            return rightSideAns+downSideAns;
    }
    public static void main(String[] args) {
        int m=9;
        int n=11;
        System.out.println(uniquePaths(m,n));
    }
}
