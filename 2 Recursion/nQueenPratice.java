public class nQueenPratice {
    public static void main(String[] args) {
        // int a[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        // int row=0;
        // int n=a.length;
        int n = 4;
        // Create a 2D array to represent the chessboard, initialized to 0 (no queens placed)
        int a[][] = new int[n][n];
        
        // Start placing queens from the first row (row = 0)
        int row = 0;
        nQueen(a,n,row);
        for (int[] arr : a) {
            for (int e : arr) {
                // Print each element of the array (either 0 or 1)
                System.out.print(e + " ");
            }
            // Print a new line after each row
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] a,int n,int row,int col){
        for (int i = 0; i < n; i++) {
            if (a[i][col]==1) {
                return false;
            }
        }
        for (int i = row,j=col; i >=0 & j>=0; i--,j--) {
            if (a[i][j]==1) {
                return false;
            }
        }
        for (int i = row,j=col; i >=0 & j<n; i--,j++) {
            if (a[i][j]==1) {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(int [][] a,int n,int row){
        if (row==n) {
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(a,n,row,col)) {
                a[row][col]=1;
                if (nQueen(a, n, row+1)) {
                    return true;
                }
            }
            a[row][col]=0;
        }
        return false;
    }
}
