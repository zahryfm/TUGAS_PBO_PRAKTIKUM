package tugas_3_praktikum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class BedaScannerBuffer {
    public static void main(String[] args) throws IOException {
        // Contoh menggunakan BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan nama (BufferedReader): ");
        String namaBuffer = br.readLine();

        // Contoh menggunakan Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur (Scanner): ");
        int umurScanner = sc.nextInt();

        System.out.println("Halo " + namaBuffer + ", umur kamu " + umurScanner + " tahun.");
    }
}
