public class tohPractice {
    public static void main(String[] args) {
        int n = 3;
        toh(n, 'a', 'b', 'c');
    }

    public static void toh(int n, char from, char aux, char to) {
        if (n == 0) {
            return;
        }
        toh(n-1,from,to,aux);
        System.out.println("Move "+n+" from "+from+" to "+to);
        toh(n-1, aux, from,to);

    }
}