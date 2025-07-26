public class rotate_matrix_90 {
    public static void main(String[] args) {
        int a[][]={{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(rotatematrix(a));
    }
    public static int rotatematrix(int[][] a){
        int n=a.length;
        //          METHOD 1 CREATE A NEW MATRIX AND MAKE CHANGES SO THAT IT ROTATES BY 90*
        //                       THEN REPASTE IT TO ORIGINAL MATRIX
        int[][] b=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[j][n-1-i]=a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=b[i][j];
            }
        }
        //           METHOD 2 : TRANSPOSE MATRIX THEN SWAP COLUMNS(BY 2 POINTER APPROACH)

        // int l=0;
        // int temp;
        // int r=n-1;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         temp = a[i][j];
        //         a[i][j] = a[j][i];
        //         a[j][i] = temp;
        //     }
        // }
        // for(int k = 0; k < n; k++) {
        //     while (l < r) {
        //         temp = a[k][r];
        //         a[k][r] = a[k][l];
        //         a[k][l] = temp;
        //         l++;
        //         r--;
        //     }
        //     l=0;
        //     r=n-1;
        // }
        System.out.println("Matrix after 90* rotation is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return n;
    }
}