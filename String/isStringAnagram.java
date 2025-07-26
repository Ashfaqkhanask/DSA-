import java.util.*;
public class isStringAnagram{
    public static void main(String[] args) {
        String str1="Hello";
        String str2="elhol";
        // Array method
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int c=0;
        for (int i = 0; i < c2.length; i++) {
            if (c1[i]!=c2[i]) {
                c+=1;
            }
        }
        if (c==0) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not An Anagram");
        }
        //System.out.println(myStr.indexOf("planet"));
    //     Map<Character, Integer> map1 = new HashMap<>();
    //     Map<Character, Integer> map2 = new HashMap<>();

    //     for (char ch : str1.toCharArray()) {
    //         map1.put(ch, map1.getOrDefault(ch, 0) + 1);
    //     }

    //     for (char ch : str2.toCharArray()) {
    //         map2.put(ch, map2.getOrDefault(ch, 0) + 1);
    //     }

    //     System.out.println(map1.equals(map2));
    // }
    ///
        System.out.println(checkAnagram(str1,str2));
    }
    public static boolean checkAnagram(String str1,String str2){
        int[] a=new int[256];
        for (int i = 0; i < str1.length(); i++) {
            a[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            a[str2.charAt(i)]--;
        }
        for (int e : a) {
            System.out.print(e);
            if (e!=0) {
                return false;
            }
        }
        return true;
    }
}