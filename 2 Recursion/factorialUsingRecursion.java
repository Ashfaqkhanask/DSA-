public class factorialUsingRecursion {
    public static int factorial(int f){
        if(f==1){
            return 1;
        }
        return f*factorial(f-1);
    }
    public static void main(String[] args) {
        int f=5;
        System.out.println(factorial(f));
    }
}
