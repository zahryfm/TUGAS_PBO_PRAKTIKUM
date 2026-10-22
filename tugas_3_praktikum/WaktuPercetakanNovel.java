package tugas_3_praktikum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WaktuPercetakanNovel {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan jumlah novel yang akan dicetak : ");
            int jumlahNovel = Integer.parseInt(br.readLine());

            System.out.print("Masukkan tebal lembar per novel         : ");
            int tebalPerNovel = Integer.parseInt(br.readLine());

            // Kecepatan mesin: 1 lembar / detik
            // Total detik = total keseluruhan lembar yang dicetak
            long totalDetik = (long) jumlahNovel * tebalPerNovel;

            // Konversi ke hari, jam, menit, dan detik berdasarkan tabel keterangan
            long hari = totalDetik / 86400;
            long sisaDetik = totalDetik % 86400;

            long jam = sisaDetik / 3600;
            sisaDetik %= 3600;

            long menit = sisaDetik / 60;
            long detik = sisaDetik % 60;

            System.out.println("\n--- HASIL PERHITUNGAN WAKTU PERCETAKAN ---");
            System.out.println("Total lembar yang dicetak : " + (jumlahNovel * tebalPerNovel) + " lembar");
            System.out.println("Waktu yang diperlukan     : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        } catch (NumberFormatException e) {
            System.out.println("Harap masukkan angka yang valid!");
        }
    }
}

