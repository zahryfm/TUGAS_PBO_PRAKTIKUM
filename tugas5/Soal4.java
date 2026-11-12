import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int banyak = in.nextInt();
        int total = 0, ganjil = 1;
        for (int i = 1; i <= banyak; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }
        System.out.println("\nTotal penjumlahan : " + total);
    }
}
