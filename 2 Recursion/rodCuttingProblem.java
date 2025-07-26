import java.util.Arrays;

public class rodCuttingProblem {

    public static void main(String[] args) {
        // Initialize input values
        int N = 25;  // Length of the rod
        // int[] r = {6,13,7};  // Possible rod lengths to cut
        int a=7;
        int b=6;
        int c=13;
        int dp[]=new int[N+1];
        Arrays.fill( dp,-2);
        // Call the method to calculate maximum pieces
        // System.out.println(maximumRods(r, N));

        System.out.println(maxRods(N, a, b, c,dp));
    }
    //          ANUJ BHAIYA VERY NICE EXPLANATION RECURSION DOUBTS ALWAYS SEE

    public static int maxRods(int N,int a,int b,int c,int [] dp){
        if (N==0) {
            return dp[N]=0;
            // return 0;        //Normal method without dp
        }
        if (N<0) {
            return -1;
        }
        if (dp[N]!=-2) {
            return dp[N];
        }
        int cutA=maxRods(N-a,a,b,c,dp);
        int cutB=maxRods(N-b,a,b,c,dp);
        int cutC=maxRods(N-c,a,b,c,dp);
        int res= Math.max(cutA, Math.max(cutC, cutB));
        if (res==-1) {
            // return -1;
            return dp[N]=-1;
        }
        // return res+1;
        return dp[N]=res+1; 
    }



    // Method to calculate maximum number of pieces recursively
    // public static int maximumRods(int[] r, int N) {
    //     // Base case: If N is 0, we have no rod left to cut
    //     if (N == 0) {
    //         return 0;
    //     }

    //     // Variable to store the maximum number of pieces
    //     int maxPieces = -1; // Start with an impossible value (since we can't have negative pieces)

    //     // Try cutting the rod using each possible length from the array r[]
    //     for (int length : r) {
    //         if (N >= length) {
    //             // Recursively solve the subproblem for remaining length (N - length)
    //             int pieces = maximumRods(r, N - length);
                
    //             // If a valid solution exists, update the maximum pieces
    //             if (pieces != -1) {
    //                 maxPieces = Math.max(maxPieces, pieces + 1);
    //             }
    //         }
    //     }

    //     // Return the maximum number of pieces found, or -1 if no valid cut was found
    //     return maxPieces;
    // }
}