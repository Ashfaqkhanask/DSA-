public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        System.out.println("Longest Common Prefix : "+lcp(words));
    }
    public static String lcp(String strs[]){
        if (strs.length==0||strs==null) {
            return "";
        }
        return divAndConq(strs,0,strs.length-1);
    }
    public static String divAndConq(String[] strs,int l,int r){
        if (l==r) {
            return strs[l];
        }
        int mid=(l+r)/2;
        String lcpLeft=divAndConq(strs, l, mid);
        String lcpRight=divAndConq(strs, mid+1, r);
        return commonPrefix(lcpLeft,lcpRight);
    }
    public static String commonPrefix(String str1,String str2){
        int minLen=Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i)!=str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1.substring(0, minLen);
    }
}























// public class longestCommonPrefix {
//     public static void main(String[] args) {
//         String[] words = {"flower","flow","flight"};
//         System.out.println("Longest Common Prefix : "+lcp(words));
//     }
//     public static String lcp(String[] strs){
//         if (strs==null || strs.length==0) {
//             return "";
//         }
//         String prefix=strs[0];
//         for (int i = 1; i < strs.length; i++) {
//             while (strs[i].indexOf(prefix)!=0) {
//                 prefix=prefix.substring(0,prefix.length()-1);
//                 if (prefix.isEmpty()) {
//                     return "";
//                 }
//             }
//         }
//         return prefix;
//     }
// }
