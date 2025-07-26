public class lengthOfLastWordInString {
    public static void main(String[] args) {
        String s="i am the boss Taddum";
    char[] c=s.toCharArray();
    int length=0;
    for (int i = c.length-1; i >=0; i--) {
        if (c[i]==' ') {
            System.out.println("length of the last word in agiven string is : "+length);
            break;
        }
        length+=1;
    }   
    }
}
