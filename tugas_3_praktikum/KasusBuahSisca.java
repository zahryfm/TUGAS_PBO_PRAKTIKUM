package tugas_3_praktikum;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KasusBuahSisca {
    public static void main(String[] args) {
        // Diketahui dari soal:
        int manggaAwal = 70;
        int manggaBusuk = 15;
        int manggaBagus = manggaAwal - manggaBusuk;

        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;
        int totalJambu = jumlahTetangga * jambuPerTetangga;

        int totalBuahDibeli = manggaAwal + totalJambu;
        int sisaBuahDimiliki = manggaBagus + totalJambu;

        System.out.println("--- LAPORAN PEMBELIAN BUAH IBU SISCA ---");
        System.out.println("Mangga dibeli          : " + manggaAwal + " pcs");
        System.out.println("Mangga busuk (kembali) : " + manggaBusuk + " pcs");
        System.out.println("Jambu untuk tetangga   : " + totalJambu + " pcs");
        System.out.println("----------------------------------------");
        System.out.println("Total buah yang dibeli awal : " + totalBuahDibeli + " pcs");
        System.out.println("Total buah bersih di tangan : " + sisaBuahDimiliki + " pcs");
    }
}