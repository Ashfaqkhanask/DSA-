public class patternMatchingAlogrithmNaive{
    public static void main(String[] args) {
        String s="abcabdabbacdabda";
        String p="bda";
        System.out.println(patternMatching(s,p));
        int j=0;
        int i=0;
        for (; i < s.length(); i++) {
            if (s.charAt(i)!=p.charAt(j)) {
                j=0;
            }
            if (s.charAt(i)==p.charAt(j)) {
                j+=1;
            }
            if (j==3) {
                System.out.println("Pattern found at : "+(i-2));
                j=0;
            }
        }
    }
    public static boolean patternMatching(String s,String p){
        char[] cs=s.toCharArray();
        char[] cp=p.toCharArray();
        int j=0;
        int i=0;
        for (; i < cs.length; i++) {
            if (cs[i]!=cp[j]) {
                j=0;
            }
            if (cs[i]==cp[j]) {
                j+=1;
            }
            if (j==3) {
                System.out.println("Pattern found at : "+(i-2));
                j=0;
            }
        }
        return false;
    }
}
