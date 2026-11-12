public class Soal5 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Half Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nFull Triangle");
        for (int i = 1; i <= n; i++) {
            int bintang = (i <= (n + 1) / 2) ? 2 * i - 1 : 2 * (n - i) + 1;
            int spasi = (n - bintang) / 2;
            for (int s = 0; s < spasi; s++) System.out.print(" ");
            for (int j = 0; j < bintang; j++) System.out.print("*");
            System.out.println();
        }
    }
}
