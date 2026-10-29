/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodeGolongan = input.nextInt();
        System.out.print("Masukkan Status Pernikahan (1. Menikah / 2. Belum Menikah / 3. Cerai / 4. Menikah dan Punya Anak): ");
        int statusPernikahan = input.nextInt(); // Sesuai tabel golongan
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();
        
        double gajiPokok = 0;
        
        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode golongan tidak valid.");
                System.exit(0);
        }
        
        // Tunjangan pasangan = 10% dari gaji pokok (jika golongan 1 atau 4 diasumsikan punya pasangan)
        double tunjanganPasangan = 0;
        if (kodeGolongan == 1 || kodeGolongan == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }
        
        // Tunjangan anak = 5% dari gaji pokok dikali jumlah anak
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        
        // Total Tunjangan
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        
        // Gaji Bersih = Gaji Pokok + Tunjangan
        double gajiBersih = gajiPokok + totalTunjangan;
        
        System.out.println("\n--- STRUK GAJI KARYAWAN ---");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + totalTunjangan);
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
        
        input.close();
    }
}