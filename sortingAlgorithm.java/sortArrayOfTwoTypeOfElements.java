public class sortArrayOfTwoTypeOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};// FOR UNKNOWN ELEMENTS : 
        ///                FIRST WE FIND THOSE ELEMENTS THE CAN APPLY SAME METHOD OR 2 POINTER 
        sortBinaryArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortBinaryArray(int[] arr) {
        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Fill 0s
        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        // Fill 1s
        for (int i = zeroCount; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
