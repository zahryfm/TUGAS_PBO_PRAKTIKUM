import java.util.Scanner;

class DataMahasiswa {
    private String nama;
    private String npm;
    private String kelas;

    DataMahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNpm(String npm) {
        this.npm = npm;
    }

    void setKelas(String kelas) {
        this.kelas = kelas;
    }

    void tampilkan() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();
        System.out.print("Masukkan kelas : ");
        String kelas = input.nextLine();

        DataMahasiswa mhs = new DataMahasiswa(nama, npm, kelas);

        System.out.println();
        System.out.println("DATA MAHASISWA");
        mhs.tampilkan();
        input.close();
    }
}
