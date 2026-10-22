package tugas_3_praktikum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SelisihWaktu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--- Waktu Pertama ---");
        System.out.print("Jam   : ");
        int jam1 = Integer.parseInt(br.readLine());
        System.out.print("Menit : ");
        int menit1 = Integer.parseInt(br.readLine());
        System.out.print("Detik : ");
        int detik1 = Integer.parseInt(br.readLine());

        System.out.println("\n--- Waktu Kedua ---");
        System.out.print("Jam   : ");
        int jam2 = Integer.parseInt(br.readLine());
        System.out.print("Menit : ");
        int menit2 = Integer.parseInt(br.readLine());
        System.out.print("Detik : ");
        int detik2 = Integer.parseInt(br.readLine());

        // Konversi semua ke total detik
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        int sJam = selisihDetik / 3600;
        int sMenit = (selisihDetik % 3600) / 60;
        int sDetik = selisihDetik % 60;

        System.out.println("\n--- SELISIH WAKTU ---");
        System.out.println(sJam + " Jam, " + sMenit + " Menit, " + sDetik + " Detik");
    }
}
