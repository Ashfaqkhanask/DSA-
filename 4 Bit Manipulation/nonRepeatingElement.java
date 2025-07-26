//1. BRUTE FORCE
//2. HASHMAP
//3. BIT MANIPULATION (XOR)
public class nonRepeatingElement {
    public static void main(String[] args) {
        int n[]={1,2,3,4,4,3,6,2,1};
        int element=0;
        System.out.println(elementIs(n,element));
        System.out.println(nonRepeatingElementIs(n));
    }
    public static int nonRepeatingElementIs(int[] n){
        int ans=0;
        for (int i : n) {
            ans^=i;
        }
        return ans;
    }
    public static int elementIs(int n[],int element){
        int count=0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i]==n[j]) {
                    count++;
                    continue;
                }
            }
            if (count>1) {
                count=0;
            }
            else{
                element=n[i];
                break;
            }
        }
        return element;
    }
}
