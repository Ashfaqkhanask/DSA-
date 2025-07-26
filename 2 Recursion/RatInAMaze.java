public class RatInAMaze {
    // TIME COMPLEXITY O(2^(n^2))
    // SPACE COMPLEXITY O(N^2)
    public static void main(String[] args) {
        int a[][] = {
            {1, 1, 0, 1},
            {1, 1, 1, 1},
            {0, 0, 1, 0},
            {1, 1, 1, 1}
        };
        int i = 0;
        int j = 0;
        boolean vis[][] = new boolean[a.length][a[0].length];
        boolean isPathPossible = ratInMaze(a, vis, i, j);
        System.out.println("Is path possible? " + isPathPossible);
    }

    public static boolean ratInMaze(int a[][], boolean[][] vis, int i, int j) {
        // Check if the current cell is out of bounds, blocked, or already visited
        if (i >= a.length || j >= a[0].length || a[i][j] == 0 || vis[i][j]) {
            return false;
        }

        // If we've reached the bottom-right corner, return true
        if (i == a.length - 1 && j == a[0].length - 1) {
            return true;
        }

        // Mark the current cell as visited
        vis[i][j] = true;

        // Try moving down
        if (ratInMaze(a, vis, i + 1, j)) {
            return true;
        }

        // Try moving right
        if (ratInMaze(a, vis, i, j + 1)) {
            return true;
        }

        // Backtrack: unmark the current cell
        vis[i][j] = false;

        return false; // No path found
    }
}
