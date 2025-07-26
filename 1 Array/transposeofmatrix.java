public class transposeofmatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(transpose(a));
        // transpose(a);
    }
    public static int transpose(int[][] a){
        int n=a.length;
        int temp;
        for(int i=0;i<n;i++){
            for (int j = i; j < n; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println("Transpose of Matrix is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }
}