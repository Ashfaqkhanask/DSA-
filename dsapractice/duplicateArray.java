import java.util.HashSet;
// import java.util.HashMap;
public class duplicateArray{
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,4,5,6,7};
        HashSet<Integer> numbers = new HashSet<Integer>();// note this line
        for (int i = 0; i < a.length; i++) {
            if (numbers.contains(a[i])) {
                System.out.println("Duplicate is : " +a[i]);
            }
            numbers.add(a[i]);
        }
    }
}