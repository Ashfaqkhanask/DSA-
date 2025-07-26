public class bitsRequiredToConvertOneToAnotherNumber {
    public int minFlips(int start, int goal) {
        // XOR the two numbers to find differing bits
        int xor = start ^ goal;
        
        // Count the number of 1s in the XOR result (which indicates bit flips)
        int flips = 0;
        while (xor != 0) {
            flips += xor & 1;  // If the least significant bit is 1, increment the flip count
            xor >>= 1;         // Right shift to check the next bit
        }
        
        return flips;
    }

    public static void main(String[] args) {
        bitsRequiredToConvertOneToAnotherNumber solution = new bitsRequiredToConvertOneToAnotherNumber();
        
        // Example 1
        int start = 16, goal = 19;
        System.out.println(solution.minFlips(start, goal));
    }
}
