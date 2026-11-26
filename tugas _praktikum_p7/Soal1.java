class Mobil {
    String merk;
    String warna;
    int tahun;

    void tampilkanInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }

    void jalan() {
        System.out.println(merk + " sedang berjalan");
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.tahun = 2020;

        Mobil mobil2 = new Mobil();
        mobil2.merk = "Honda";
        mobil2.warna = "Putih";
        mobil2.tahun = 2022;

        mobil1.tampilkanInfo();
        mobil1.jalan();
        System.out.println();
        mobil2.tampilkanInfo();
        mobil2.jalan();
    }
}
