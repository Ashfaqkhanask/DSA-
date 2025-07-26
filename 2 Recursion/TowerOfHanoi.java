public class TowerOfHanoi{
    public static void main(String[] args) {
        int n=3;
        toh(n,"A","C","B");
    }
    public static void toh(int n, String from, String to, String aux) {
        // Your code here           A           C           B
        if (n==0){
            return;
        }
        toh(n-1,from,aux,to);//A,B,C
        System.out.println("Move "+n+" from "+from+" to "+to);
        toh(n-1,aux,to,from);//B,C,A
    }
}