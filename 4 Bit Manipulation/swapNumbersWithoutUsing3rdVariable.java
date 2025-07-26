public class swapNumbersWithoutUsing3rdVariable {
    public static void main(String[] args) {
        int a = 12, b = 23;
        System.out.println("a = " + a + " b = " + b);   
      
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
      
        System.out.println("a = " + a + " b = " + b);

    // Alternate Method [ USING ARITHMETIC OPERATORS ]  
        a = a + b;
        b = a - b;
        a = a - b;
      
        System.out.println("a = " + a + " b = " + b);
    }
}
