public class leftmostRepeatingChar {
    public static void main(String[] args) {//METHOD 3 : USE HASHMAP
        String s="applejuice";

        ////METHOD 2
        int res=repeatChar(s);
        if (res!=-1) {
            System.out.println("leftmost Repeating Char : "+s.charAt(res));
        }
        else{
            System.out.println("No leftmost repeating character found");
        }

        //////METHOD 1
        Character result=repeatingChar(s);
        if (result!=null) {
            System.out.println("lefmost repeating character in a string : "+result);
        }
        else{
            System.out.println("No repeating character found");
        }
    }
        // Method 1 : ASCII METHOD

    public static Character repeatingChar(String s){
        int[] a=new int[256];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }
        for (int i : a) {
            if (a[s.charAt(i)]>1) {
                return s.charAt(i);
            }
        }
        return null;

    }




    // Method 2: Single Pass from Right to Left (Best for Index)

    // Use a boolean array to track seen characters and traverse from right to left
    //  to find the leftmost repeating character index.

    public static int repeatChar(String s){
        boolean[] visited=new boolean[256];
        int result=-1;
        for (int i = s.length()-1; i >= 0 ; i--) {
            char ch=s.charAt(i);
            if (visited[ch]) {
                result=i;// update with the leftmost index
            }
            else{
                visited[ch]=true;
            }
        }
        return result;
    }
}
