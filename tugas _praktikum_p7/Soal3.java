import java.util.Scanner;

class TebakLahir {
    int hitungRahasia(int bulan, int tanggal) {
        int hasil = bulan * 5;
        hasil = hasil + 6;
        hasil = hasil * 4;
        hasil = hasil + 9;
        hasil = hasil * 5;
        hasil = hasil + tanggal;
        return hasil;
    }

    int tebak(int angkaRahasia) {
        return angkaRahasia - 165;
    }
}

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TebakLahir trik = new TebakLahir();

        System.out.print("Masukkan bulan lahir (1-12)   : ");
        int bulan = input.nextInt();
        System.out.print("Masukkan tanggal lahir (1-31) : ");
        int tanggal = input.nextInt();

        int rahasia = trik.hitungRahasia(bulan, tanggal);
        System.out.println("Angka hasil perhitungan : " + rahasia);
        System.out.println("Hasil tebakan           : " + trik.tebak(rahasia));
        input.close();
    }
}
