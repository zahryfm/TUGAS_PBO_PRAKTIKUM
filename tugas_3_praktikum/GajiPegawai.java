package tugas_3_praktikum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GajiPegawai {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nomor Induk Karyawan : ");
        String nik = br.readLine();

        System.out.print("Masukkan Nama Karyawan        : ");
        String nama = br.readLine();

        System.out.print("Masukkan Alamat               : ");
        String alamat = br.readLine();

        // Data yang sudah ditentukan di soal
        double gajiPokok = 2000000;
        double tunjanganJabatan = 300000;
        double tunjanganIstri = 200000;
        double tunjanganAnak = 150000;

        double totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n--- STRUK GAJI PEGAWAI ---");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : Manajer");
        System.out.println("Total Gaji           : " + totalGaji);
        System.out.println("Pajak Penghasilan    : " + pajak);
        System.out.println("Gaji Bersih          : " + gajiBersih);
    }
}
