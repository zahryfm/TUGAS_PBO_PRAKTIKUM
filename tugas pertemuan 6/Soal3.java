import java.util.Scanner;

/**
 * Soal 3: Array satu dimensi dengan input dinamis (a - h).
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Masukkan jumlah elemen array satu dimensi
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] data = new int[n];

        // b. Masukkan nilai elemen sesuai jumlah elemennya
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        // c. Nilai terbesar dan terkecil beserta posisi indeksnya
        int max = data[0], idxMax = 0;
        int min = data[0], idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
                idxMax = i;
            }
            if (data[i] < min) {
                min = data[i];
                idxMin = i;
            }
        }
        System.out.println("\n(c) Nilai terbesar : " + max + " pada indeks " + idxMax);
        System.out.println("    Nilai terkecil : " + min + " pada indeks " + idxMin);

        // d. Jumlah semua data dan rata-rata
        int total = 0;
        for (int v : data) {
            total += v;
        }
        double rata = (double) total / n;
        System.out.println("(d) Jumlah semua data : " + total);
        System.out.println("    Rata-rata         : " + rata);

        // e. Jumlah elemen yang berindeks ganjil (NPM genap)
        int jumlahGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahGanjil += data[i];
        }
        System.out.println("(e) Jumlah elemen berindeks ganjil (NPM genap) : " + jumlahGanjil);

        // f. Jumlah elemen yang berindeks genap (NPM ganjil)
        int jumlahGenap = 0;
        for (int i = 0; i < n; i += 2) {
            jumlahGenap += data[i];
        }
        System.out.println("(f) Jumlah elemen berindeks genap (NPM ganjil) : " + jumlahGenap);

        // g. Cek hasil penjumlahan e atau f, apakah bernilai ganjil atau genap
        System.out.println("(g) Hasil (e) = " + jumlahGanjil + " -> "
                + (jumlahGanjil % 2 == 0 ? "genap" : "ganjil"));
        System.out.println("    Hasil (f) = " + jumlahGenap + " -> "
                + (jumlahGenap % 2 == 0 ? "genap" : "ganjil"));

        // h. Urutkan elemen array (bubble sort, ascending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.print("(h) Array setelah diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();

        input.close();
    }
}
