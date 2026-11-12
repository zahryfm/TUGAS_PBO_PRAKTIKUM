import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan banyak baris : ");
        int baris = in.nextInt();
        int angka = 1;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka++ + " ");
            }
            System.out.println();
        }
    }
}
