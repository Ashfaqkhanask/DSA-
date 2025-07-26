public class checkIfStringsAreRotaional {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="dcba";
        chkRotation(s1,s2);
    }
    public static boolean chkRotation(String s1,String s2){
        if (s1.length()!=s2.length()) return false;
        String doubleString = s1+s1;
        if (doubleString.contains(s2)) return true;
        return doubleString.contains(s2);
    }
}