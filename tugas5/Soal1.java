import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0, min = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int n = in.nextInt();
            if (i == 1) { max = n; min = n; }
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("Terbesar : " + max);
        System.out.println("Terkecil : " + min);
    }
}
