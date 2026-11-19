
public class Soal1 {
    public static void main(String[] args) {
        
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        
        int[] b = {1, 2, 3, 4, 5};

        
        int c[] = new int[]{100, 200, 300};

        System.out.println("Variasi 1 (new int[3])        : " + java.util.Arrays.toString(a));
        System.out.println("Variasi 2 (int[] b = {...})   : " + java.util.Arrays.toString(b));
        System.out.println("Variasi 3 (new int[]{...})    : " + java.util.Arrays.toString(c));
    }
}
