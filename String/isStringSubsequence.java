public class isStringSubsequence {
    public static boolean isSubsequence(String s, String t) {
            int c=0;
            char[] cs=s.toCharArray();
            char[] ct=t.toCharArray();
            for(int i=0;i<ct.length;i++){///  Concept same as 2 pointer 
                if(cs[c]==ct[i]){
                    c+=1;
                }
                if(c==cs.length){
                    System.out.println("true");
                    return true;
                }
            }
            if (c!=cs.length) {
                System.out.println("false");
            }
            return false;
        }
        public static void main(String[] args) {
            String s="abc";
            String t="axbyzc";
            isSubsequence(s,t);
    }
}
