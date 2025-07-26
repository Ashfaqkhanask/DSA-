public class reverseWordsInString {
    public static void main(String[] args) {
        String s="i am the boss";
        System.out.println(reverseWords(s));
    }
    public static void reverseCharacters(char[] s,int i,int j){
        while (i<j) {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
    public static String reverseWords(String s){
        char[] c= s.toCharArray();
        System.out.println(c);
        int start=0;
        int end=0;
        for (; end < s.length(); end++) {
            if (c[end]== ' ') {
                reverseCharacters(c,start,end-1);
                start=end+1;
            }
        }
        reverseCharacters(c,start,end-1);
        reverseCharacters(c,0,s.length()-1);
        return new String(c);
    }
}
