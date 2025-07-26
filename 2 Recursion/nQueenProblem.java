public class nQueenProblem {
    public static void main(String[] args) {
        // Set the size of the chessboard (4x4 in this case)
        int n = 4;
        // Create a 2D array to represent the chessboard, initialized to 0 (no queens placed)
        int a[][] = new int[n][n];
        
        // Start placing queens from the first row (row = 0)
        int row = 0;
        
        // Call the nQueen function to solve the problem starting from row 0
        nQueen(a, row, n);
        
        // Print the chessboard after placing the queens
        for (int[] arr : a) {
            for (int e : arr) {
                // Print each element of the array (either 0 or 1)
                System.out.print(e + " ");
            }
            // Print a new line after each row
            System.out.println();
        }
    }

    // Method to check if it is safe to place a queen at position (row, col)
    public static boolean isSafe(int a[][], int n, int row, int col) {
        // Check if there is any queen in the same column (check all rows for the given column)
        for (int i = 0; i < n; i++) {
            if (a[i][col] == 1) { // If there is a queen, return false
                return false;
            }
        }
        
        // Check the upper-left diagonal (starting from (row, col) and moving up-left)
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (a[i][j] == 1) { // If there is a queen on this diagonal, return false
                return false;
            }
        }
        
        // Check the upper-right diagonal (starting from (row, col) and moving up-right)
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (a[i][j] == 1) { // If there is a queen on this diagonal, return false
                return false;
            }
        }

        // If no conflict is found, it is safe to place the queen
        return true;
    }

    // Method to solve the N-Queens problem using backtracking
    public static boolean nQueen(int a[][], int row, int n) {
        // If all queens are placed successfully (row == n), return true
        if (row == n) {
            return true;
        }

        // Try placing a queen in each column of the current row
        for (int c = 0; c < n; c++) {
            // Check if it is safe to place a queen at (row, c)
            if (isSafe(a, n, row, c)) {
                // If safe, place the queen by setting a[row][c] to 1
                a[row][c] = 1;

                // Recursively try to place queens in the next row
                if (nQueen(a, row + 1, n)) {
                    return true; // If placing the queen in the next row is successful, return true
                }

                // If placing the queen in the next row was not successful, backtrack
                // Remove the queen by setting a[row][c] back to 0
                a[row][c] = 0;
            }
        }

        // If no column in the current row allows a safe placement, return false
        return false;
    }
}
