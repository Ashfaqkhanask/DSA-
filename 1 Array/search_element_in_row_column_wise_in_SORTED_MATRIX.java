import java.util.Scanner;
public class search_element_in_row_column_wise_in_SORTED_MATRIX {
    public static void main(String[] args) {
        int[][] a = { { 1, 4, 5, 7 },
                      { 2, 5, 6, 9 },
                      { 6,10, 11,13 } };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key : ");
        int key = sc.nextInt();
        System.out.println(search_key_in_Matrix(a, key));
    }
    public static boolean search_key_in_Matrix(int[][] a, int key) {
        int n = a.length;
        int nc = a[0].length;
        int row = 0;
        int column = nc - 1;
        while (row < a.length && column >= 0) {
            if (a[row][column] == key) {
                System.out.println("keyfound in " + (row + 1) + " row " + (column + 1) + " column");
                return true;
            } else if (a[row][column] < key) {
                row++;
            } else if (a[row][column] > key) {
                column--;
            }
        }
        return false;
    }
}
// System.out.println("total rows : "+nr);
        // int[] b=a[0];
        // int nc=b.length;
        // System.out.println("total columns : "+nc);
        // int row=0;
        // for(int r=0;r<nr;r++){
        //     if(a[r][nc-1]>=key){
        //         row=r;
        //         break;
        //     }
        // }
        // System.out.println("key may be in row : "+(row+1));
        // for(int c=0;c<nc;c++){
        //     if(a[row][c]==key){
        //         System.out.println(key+" is present at : "+(row+1)+" row "+(c+1)+" column ");
        //         break;
        //     }
        // }
        // ///////COLUMN - WISE 
        // int column=0;
        // for(int c=0;c<nc;c++){
        //     if(a[nr-1][c]>=key){
        //         column=c;
        //         break;
        //     }
        // }
        // System.out.println("key may be in column : "+(column+1));
        // for(int r=0;r<nr;r++){
        //     if(a[r][column]==key){
        //         System.out.println(key+" is present at : "+(r+1)+" row "+(column+1)+" column ");
        //         break;
        //     }
        // }