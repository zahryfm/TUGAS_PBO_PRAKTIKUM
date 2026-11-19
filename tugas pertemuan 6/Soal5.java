import java.util.Scanner;


public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris  : ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom  : ");
        int kolom = input.nextInt();

        int[][] a = new int[baris][kolom];
        int[][] b = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMasukkan elemen Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                b[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }

        cetak("Matriks A", a);
        cetak("Matriks B", b);
        cetak("Hasil A + B", hasil);

        input.close();
    }

    static void cetak(String judul, int[][] m) {
        System.out.println("\n" + judul + ":");
        for (int[] row : m) {
            for (int v : row) {
                System.out.printf("%5d", v);
            }
            System.out.println();
        }
    }
}
