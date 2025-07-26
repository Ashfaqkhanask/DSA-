public class substringOfStringByRecursion {
    public static void main(String[] args) {
        String s="abc";
        // NOTE : FOR s="aaa" WE HAVE TO USE SET PROPERTIES SO THAT SUBSETS ARE UNIQUE
        String cur="";
        int i=0;
        System.out.println(subString(s,cur,i));
    }
    public static String subString(String s,String cur,int i){
        if(i==s.length()){
            return ","+cur;
        }
        return subString(s, cur,i+1)+" "+subString(s, cur=cur+s.charAt(i),i+1);
    }
}
// public class substringOfStringByRecursion {
//     public static void main(String[] args) {
//         String s="abc";
//         String cur="";
//         int i=0;
//         subString(s,cur,i);
//     }
//     public static void subString(String s,String cur,int i){
//         if(i==s.length()){
//             System.out.println(cur+" ");
//             return;
//         }
//         subString(s, cur,i+1);
//         subString(s,cur+s.charAt(i),i+1);
//     }
// }
